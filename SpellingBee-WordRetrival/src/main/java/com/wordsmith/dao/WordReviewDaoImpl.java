package com.wordsmith.dao;

import org.springframework.stereotype.Repository;

import com.wordsmith.domain.Word;

@Repository ("WordReviewDao")
public class WordReviewDaoImpl implements WordReviewDao {


	@Override
	public void reviewWord(Word word) {
		// TODO Auto-generated method stub
		// -- Call the DB stuff to save
				System.out.println(" reviewWord word");
				System.out.println("in reviewWord word getId"+word.getId());
		
	}
	
	@Override
	public Word retrieveWord() {
		//Call the DB to get the word based on Id;
		/*System.out.println("in WordRetrieveDaoImpl retrieveWord method");
		Word word = new Word("1","School","Bhaskar" );
		//word.getId(id);
		word.getId();
		word.getActualWord();
		word.getWordUploadedBy();
		System.out.println("word.getId()>>"+word.getId()+
				"word.getActualWord()>>>"+word.getActualWord()+
				"word.getWordUploadedBy()>>>"+word.getWordUploadedBy());
		*/
		return new Word();
	}

}
