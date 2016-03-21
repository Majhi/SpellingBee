package com.wordsmith.dao;

import java.util.List;

import com.wordsmith.domain.Word;

public interface WordUploadDao {

	public void uploadWord(List<Word> word);
}
