package com.wordsmith.dao;

import com.wordsmith.domain.Word;

public interface WordReviewDao {

	
	public Word retrieveWord();
	
	public void reviewWord( Word word);
	
}
