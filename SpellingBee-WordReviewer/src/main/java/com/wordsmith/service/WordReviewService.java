package com.wordsmith.service;

import java.util.List;

import com.wordsmith.domain.Word;

public interface WordReviewService {
	
	
	public boolean setDiffilevel(List<Word> word);
	
	public List<Word> retrieveWord();
}
