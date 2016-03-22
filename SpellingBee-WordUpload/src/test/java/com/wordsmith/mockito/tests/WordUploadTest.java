package com.wordsmith.mockito.tests;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.wordsmith.dao.WordUploadDao;
import com.wordsmith.dao.WordUploadDaoImpl;
import com.wordsmith.domain.Word;
import com.wordsmith.service.WordUploadService;
import com.wordsmith.service.WordUploadServiceImpl;


public class WordUploadTest {

	/*
	 * 1. create junit
	 * 2. create junit dummy implementation
	 * 3. create mockito
	 * */
	
   WordUploadService uploader;
   Word input;
   WordUploadDao wordUploadDao;
   
   @Before
   public void setup(){
	   uploader = new WordUploadServiceImpl();
   }

   
   @Test
   public void itShouldUploadListOfWordsToDatabase(){
	   
	   List<Word> wlist = new ArrayList<Word>(20);
	   Word wl1 = new Word ();
	   wl1.setId("1");
	   wl1.setActualWord("test1");
	   Word wl2 = new Word ();
	   wl2.setId("2");
	   wl2.setActualWord("test2");
	   wlist.add(wl1);
	   wlist.add(wl2);
	   
	   uploader = new WordUploadServiceImpl(mock(WordUploadDaoImpl.class));
	   
	   boolean result = uploader.uploadWord(wlist);
	   
	   //uploaded to the database;
	   assertEquals(result,true);
   }
   
   
   
  /*
    @Test
   public void itShouldReturnSucessUponUpload(){
	  String input = "test";
	  uploader = mock(WordUploadService.class);
	  //Boolean result = uploader.upload("test");
	  when(uploader.upload(input)).thenReturn(true);
	  boolean result = uploader.upload(input);
	  assertEquals(result,true);
   }
   
  @Test
   public void itShouldAcceptWordObject(){
	   input = new Word();
	   input.setId(1);
	   input.setActualWord("test");
	   uploader = mock(WordUploadService.class);
	   when(uploader.uploadWord(input)).thenReturn(true);
	   boolean result = uploader.uploadWord(input);
	   assertEquals(result,true);
   }
   
   @Test
   public void itShouldUploadWordToDatabase(){
	   input = new Word();
	   input.setId(1);
	   input.setActualWord("test");
	   uploader = mock(WordUploadService.class);
	   when(uploader.uploadWordToDatabase(input)).thenReturn(true);
	   boolean result = uploader.uploadWord(input);
	   assertEquals(result,true);
   }
   
   @Test
   public void itShouldSetStatusAsUploaded(){
	   input = new Word();
	   input.setId(1);
	   input.setActualWord("test");
	   uploader = new WordUploadServiceImpl(mock(WordUploadDao.class));
	   boolean result = uploader.uploadWord(input);
	   assertEquals(result,true);
   }*/
      
   //no mocks in below test
  /* @Test
   public void itShouldUpload(){
	   List<Word> wlist = new ArrayList<Word>(20);
	   Word wl1 = new Word ();
	   wl1.setId(1);
	   wl1.setActualWord("test");
	   Word wl2 = new Word ();
	   wl2.setId(1);
	   wl2.setActualWord("test");
	   wlist.add(wl1);
	   wlist.add(wl2);
	   uploader = new WordUploadServiceImpl(new WordUploadDaoImpl());
	   boolean result = uploader.uploadWord(wlist);
	   assertEquals(result,true);
   }*/
   
}
