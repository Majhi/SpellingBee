package com.wordsmith.dao;

import com.wordsmith.domain.Word;

public interface WordPronuncerDao {

	
	public Word retrieveWord();
	
	public void reviewWord( Word word);
	
}
