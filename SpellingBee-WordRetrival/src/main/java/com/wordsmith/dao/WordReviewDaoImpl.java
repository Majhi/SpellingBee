package com.wordsmith.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.wordsmith.domain.Word;

@Repository ("WordReviewDao")
public class WordReviewDaoImpl implements WordReviewDao {


	
	@Override
	public void  setDiffilevel(List<Word> word){
		// -- Call the DB stuff to save
		System.out.println(" WordUploadDaoImpl word");
		System.out.println("in WordUploadDaoImpl word getId"+word.get(0).getId());
		// wordRepository.save(word);
	}
	
	@Override
	public List<Word>  retrieveWord() {
		
		List<Word> words= new ArrayList<Word>();
		
		Word w = new Word();
		w.setActualWord("STUDENT");
		words.add(w);
		
		Word w2 = new Word();
		w2.setActualWord("EXCELLENT");
		words.add(w2);
		
		return  words;
	}

}
