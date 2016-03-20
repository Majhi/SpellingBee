package com.wordsmith.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wordsmith.dao.WordReviewDao;

import com.wordsmith.domain.Word;



@Service("WordReviewService")
public class WordReviewServiceImpl  implements WordReviewService {
	

	@Autowired 
	WordReviewDao wordReviewDao;

	

	@Override
	public void reviewWord(Word word) {
		// TODO Auto-generated method stub
		wordReviewDao.reviewWord(word);
	}
	

	@Override
	public Word retrieveWord() {
		System.out.println("in WordRetrieveServiceImpl retrieveWord method");
		return wordReviewDao.retrieveWord();
		
	}
}
