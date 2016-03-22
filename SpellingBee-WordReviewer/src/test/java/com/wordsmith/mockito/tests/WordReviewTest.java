package com.wordsmith.mockito.tests;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.wordsmith.dao.WordReviewDao;
import com.wordsmith.dao.WordReviewDaoImpl;
import com.wordsmith.domain.Word;
import com.wordsmith.service.WordReviewService;
import com.wordsmith.service.WordReviewServiceImpl;


public class WordReviewTest {

	/*
	 * 1. create junit
	 * 2. create junit dummy implementation
	 * 3. create mockito
	 * */
	
	WordReviewService uploader;
   Word input;
   WordReviewDao wordUploadDao;
   
   @Before
   public void setup(){
	   uploader = new WordReviewServiceImpl();
   }

   
   @Test
   public void itShoulddifficultyOfWordsToDatabase(){
	   List<Word> wlist = new ArrayList<Word>(20);
	   Word wl1 = new Word ();
	   wl1.setId("1");
	   wl1.setActualWord("test1");
	   Word wl2 = new Word ();
	   wl2.setId("2");
	   wl2.setActualWord("test2");
	   wlist.add(wl1);
	   wlist.add(wl2);
	   uploader = new WordReviewServiceImpl(mock(WordReviewDaoImpl.class));
	   boolean result = uploader.setDiffilevel(wlist);
	   
	   //uploaded to the database;
	   assertEquals(result,true);
   }
   
   
  
}
