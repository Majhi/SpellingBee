package com.wordsmith.service;

import java.util.List;

import com.wordsmith.domain.Word;

public interface WordProuncerService {
	
	
	public void setProuncerWord(List<Word> word);
	
	public List<Word> retrieveWord();
}
