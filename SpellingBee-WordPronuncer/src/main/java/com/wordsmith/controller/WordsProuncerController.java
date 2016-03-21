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
import com.wordsmith.service.WordProuncerService;


@Controller
public class WordsProuncerController {
	
	
	@Autowired 	
	WordProuncerService wordProuncerService;
	
	@RequestMapping(value="/setProuncerWord", method = RequestMethod.POST)
	public @ResponseBody String setProuncerWord(@RequestBody List<Word> word){
		wordProuncerService.setProuncerWord(word);
		return "Difficulty Level is set for Words !!";
	}
	
	@RequestMapping(value="/wordRetrival", method = RequestMethod.GET)
	public @ResponseBody List<Word> uploadRetrival(){
		//Word word =new Word();
		//word.setId(id);
		//System.out.println("to test"+id);
		System.out.println("in WordsRetrivalController / wordRetrival method");
		return wordProuncerService.retrieveWord();
	}
	
	
}
