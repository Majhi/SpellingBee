package com.wordsmith.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wordsmith.dao.WordProuncerDao;

import com.wordsmith.domain.Word;



@Service("WordReviewService")
public class WordProuncerServiceImpl  implements WordProuncerService {
	

	@Autowired 
	WordProuncerDao wordProuncerDao;

	

	@Override
	public void setProuncerWord(List<Word> word) {
		// TODO Auto-generated method stub
		wordProuncerDao.setProuncerWord(word);
	}
	

	@Override
	public List<Word> retrieveWord() {
		System.out.println("in WordRetrieveServiceImpl retrieveWord method");
		return wordProuncerDao.retrieveWord();
		
	}
}
