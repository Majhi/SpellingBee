package com.wordsmith.dao;


import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.wordsmith.domain.Word;
import com.wordsmith.util.WordRepository;





@Repository("WordUploadDao")
//@Repository("WordRepository")
public class WordUploadDaoImpl implements WordUploadDao {
		
	/*@Autowired(required=false)
	private WordRepository wordRepository;*/
	
	// JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/spellbee";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "mysql";
	 
		@Override
		public boolean uploadWord(List<Word> word) {
		// -- Call the DB stuff to save
		System.out.println(" WordUploadDaoImpl word");
		System.out.println("in WordUploadDaoImpl word getId"+word.get(0).getId());
		// wordRepository.save(word);
		
		System.out.println("running query to upload word");
		Connection conn = null;
		PreparedStatement pstmt = null;
		int update_count = 0;
		try
		{
	      Class.forName("com.mysql.jdbc.Driver");
	      System.out.println("Connecting to database...");
	      conn = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);
	      System.out.println("Creating statement...");
	      String sqlQuery = "INSERT INTO `word`(word_string,difficulty,status) VALUES (?, ?, ?)";
	      pstmt = (PreparedStatement) conn.prepareStatement(sqlQuery);
	      conn.setAutoCommit(false);
	      
	      for(int i=0; i< word.size();i++){
		      pstmt.setString(1, word.get(i).getActualWord());
		      pstmt.setString(2, null);
		      pstmt.setString(3, "UPLOADED");
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
	   
	   return true;
	}

		
	}

