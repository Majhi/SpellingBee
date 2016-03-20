package com.wordsmith.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wordsmith.domain.Word;
import com.wordsmith.service.WordUploadService;

@Controller
public class WordsUploadController {
	
	
	@Autowired 
	WordUploadService wordUploadService;

	
	/*@RequestParam("id") String id,@RequestParam("actualWord") String actualWord,
	@RequestParam("wordUploadedBy") String wordUploadedBy*/ 
	
	@RequestMapping(value="/wordUpload", method = RequestMethod.POST)
	public ResponseEntity<List<Word>>  uploadWord(@RequestBody List<Word> word ){
		
		wordUploadService.uploadWord(word.get(0)); 
		
		return new ResponseEntity <List<Word>>(word, HttpStatus.OK);
		
	}
	/*public @ResponseBody String uploadWord(@RequestBody Word  lst ){
		Word word =new Word();
		word.setId(id);
		word.setActualWord(actualWord);
		word.setWordUploadedBy(wordUploadedBy);
		System.out.println("to test id"+word.getId());
		System.out.println("to test actualWord"+word.getActualWord());
		wordUploadService.uploadWord(word);
			System.out.println("word=== "+lst.getActualWord());
	return "Word Uploaded !!";
	}*/
	
	
	   
	
	
	public void storeWords(){
		
		
	}

}
