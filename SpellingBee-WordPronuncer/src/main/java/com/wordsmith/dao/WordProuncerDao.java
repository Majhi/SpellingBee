package com.wordsmith.dao;

import java.util.List;

import com.wordsmith.domain.Word;

public interface WordProuncerDao {

	public void setProuncerWord(List<Word> word);
	public List<Word> pronouncerWordRetrival();
}
