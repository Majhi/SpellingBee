package com.wordsmith.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wordsmith.domain.Word;
import com.wordsmith.service.WordReviewService;


@Controller
public class WordsReviewController {
	
	
	@Autowired 	
	WordReviewService wordReviewService;

	
	@RequestMapping(value="/wordRetrival", method = RequestMethod.GET)
	public @ResponseBody List<Word> uploadRetrival(){
		//Word word =new Word();
		//word.setId(id);
		//System.out.println("to test"+id);
		System.out.println("in WordsRetrivalController / wordRetrival method");
		return wordReviewService.retrieveWord();
	}
	
	@RequestMapping(value="/setDiffLevel", method = RequestMethod.POST)
	public @ResponseBody String setDiffLevel(@RequestBody List<Word> word  ){
		
		//word.setId(id);
		/*System.out.println("to test"+word.getId());
		System.out.println("in WordsRetrivalController / setDiffLevel method");*/
		wordReviewService.setDiffilevel(word);
		return "Difficulty Level is set for Words !!";
	}
}
