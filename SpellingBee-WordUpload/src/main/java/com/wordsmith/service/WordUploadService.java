package com.wordsmith.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.wordsmith.dao.WordUploadDao;
import com.wordsmith.domain.Word;

public interface WordUploadService {
	
	
	public boolean uploadWord(List<Word> word);
	

}
