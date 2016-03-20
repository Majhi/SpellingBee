package com.wordsmith.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wordsmith.domain.Word;
import com.wordsmith.util.WordRepository;





@Repository("WordUploadDao")
//@Repository("WordRepository")
public class WordUploadDaoImpl implements WordUploadDao {
		
	/*@Autowired(required=false)
	private WordRepository wordRepository;*/
	 
		@Override
		public void uploadWord(Word word) {
		// -- Call the DB stuff to save
		System.out.println(" WordUploadDaoImpl word");
		System.out.println("in WordUploadDaoImpl word getId"+word.getId());
		// wordRepository.save(word);
	}

}
