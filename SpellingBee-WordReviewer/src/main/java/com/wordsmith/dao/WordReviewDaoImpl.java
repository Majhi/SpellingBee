package com.wordsmith.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.wordsmith.domain.Word;

@Repository ("WordReviewDao")
public class WordReviewDaoImpl implements WordReviewDao {

	// JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/spellbee";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "mysql";
	
	@Override
	public void  setDiffilevel(List<Word> word){
		
		System.out.println("running query to setdiff level of word");
		Connection conn = null;
		PreparedStatement pstmt = null;
		int update_count = 0;
		try
		{
	      Class.forName("com.mysql.jdbc.Driver");
	      System.out.println("Connecting to database...");
	      conn = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);
	      System.out.println("Creating statement...");
	    //  String sqlQuery = "INSERT INTO `word`(word_string,difficulty,status) VALUES (?, ?, ?)";
	      String sqlQuery =  "UPDATE SPELLBEE.WORD SET DIFFICULTY=?, STATUS=? WHERE WORD_ID=?";
	      pstmt = (PreparedStatement) conn.prepareStatement(sqlQuery);
	      conn.setAutoCommit(false);
	      
	      for(int i=0; i< word.size();i++){
		      pstmt.setString(1, word.get(i).getDifficulty());
		      pstmt.setString(2, "REVIEWED" );
		      pstmt.setString(3, word.get(i).getId());
		      pstmt.addBatch();

	      }
	      
	      int [] res = pstmt.executeBatch();
	      System.out.println("The number of rows inserted: "+ res.length);

	   }
	   catch(Exception e)
	   {
	      e.printStackTrace();
	   }
	   finally
	   {
		   try 
		   {
			   conn.commit();
			pstmt.close();
			
		   } catch (SQLException e)
		   {
			e.printStackTrace();
		   }
		   try 
		   {
			conn.close();
		   } catch (SQLException e) {
			e.printStackTrace();
		   }
	   }
	   
	  
	
	}
	
	
	
	 
		@Override
		public  List<Word> retrieveWord() {
		Connection conn = null;
		List<Word> lst = new ArrayList<Word>();
		try
		{
	      Class.forName("com.mysql.jdbc.Driver");
	      System.out.println("Connecting to database...");
	      conn = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);
	      System.out.println("Creating statement...");
	      String sqlQuery = "SELECT * FROM SPELLBEE.WORD";
	      Statement statement = conn.createStatement();
	      java.sql.ResultSet rs=  statement.executeQuery(sqlQuery);
	      
	      while(rs.next()) {
	    	  Word wordw = new Word();
	    	  wordw.setActualWord( rs.getString(1) );
	    	  wordw.setDifficulty( rs.getString(2) );
	    	  wordw.setStatus(rs.getString(3)) ;
	    	  wordw.setId(rs.getString(4)) ;
	    	    lst.add(wordw);
	    	}
	   }
	   catch(Exception e)
	   {
	      e.printStackTrace();
	   }
	   finally
	   {
		   try 
		   {
			conn.close();
		   } catch (SQLException e) {
			e.printStackTrace();
		   }
	   }
	   
	   return lst;
	
		}



}
