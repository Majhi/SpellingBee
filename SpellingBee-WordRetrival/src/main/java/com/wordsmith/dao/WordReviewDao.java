package com.wordsmith.dao;

import java.util.List;

import com.wordsmith.domain.Word;

public interface WordReviewDao {

	
	public List<Word> retrieveWord();
	
	public void setDiffilevel(List<Word> word);
	
}
