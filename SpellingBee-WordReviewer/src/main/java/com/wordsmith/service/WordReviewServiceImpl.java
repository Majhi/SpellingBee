package com.wordsmith.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wordsmith.dao.WordReviewDao;
import com.wordsmith.domain.Word;



@Service("WordReviewService")
public class WordReviewServiceImpl  implements WordReviewService {
	

	@Autowired 
	WordReviewDao wordReviewDao;

	

	@Override
	public boolean setDiffilevel(List<Word> word) {
		// TODO Auto-generated method stub
		wordReviewDao.setDiffilevel(word);
		
		return true;
	}
	

	@Override
	public List<Word> retrieveWord() {
		System.out.println("in WordRetrieveServiceImpl retrieveWord method");
		return wordReviewDao.retrieveWord();
		
	}
	
	public WordReviewServiceImpl(){
		
	}
	public WordReviewServiceImpl(WordReviewDao wordReviewDao){
		this.wordReviewDao = wordReviewDao;
	}
}
