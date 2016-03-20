package com.wordsmith.service;

import org.springframework.beans.factory.annotation.Autowired;


import com.wordsmith.domain.Word;

public interface WordReviewService {
	
	
	public void reviewWord(Word word);
	
	public Word retrieveWord();
	

}
