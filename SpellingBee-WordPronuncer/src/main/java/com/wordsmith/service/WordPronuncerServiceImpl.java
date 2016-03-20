package com.wordsmith.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wordsmith.dao.WordPronuncerDao;


import com.wordsmith.domain.Word;



@Service("WordReviewService")
public class WordPronuncerServiceImpl  implements WordPronuncerService {
	

	@Autowired 
	WordPronuncerDao wordPronuncerDao;

	

	@Override
	public void reviewWord(Word word) {
		// TODO Auto-generated method stub
		wordPronuncerDao.reviewWord(word);
	}
	

	@Override
	public Word retrieveWord() {
		System.out.println("in WordRetrieveServiceImpl retrieveWord method");
		return wordPronuncerDao.retrieveWord();
		
	}
}
