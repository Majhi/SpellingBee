package com.wordsmith.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wordsmith.dao.WordUploadDao;
import com.wordsmith.domain.Word;



@Service("WordUploadService")
public class WordUploadServiceImpl  implements WordUploadService {
	

	@Autowired 
	WordUploadDao wordupldDao;

	@Override
	public void uploadWord(List<Word> word) {
		// TODO Auto-generated method stub
		wordupldDao.uploadWord(word);
		
	}

	
	

}
