package com.wordsmith.domain;

import java.io.Serializable;

public class Word implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String actualWord;
	private String prouncerWord;
	private String status;
	      
    public String getProuncerWord() {
		return prouncerWord;
	}

	public void setProuncerWord(String prouncerWord) {
		this.prouncerWord = prouncerWord;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getActualWord() {
		return actualWord;
	}

	public void setActualWord(String actualWord) {
		this.actualWord = actualWord;
	}


/*	public Word(String id, String actualWord, String  wordUploadedBy) {
        this.id = id;
        this.actualWord = actualWord;
        this.wordUploadedBy = wordUploadedBy;
    }*/
	/*private String actualWord;
    private String wordInsertedByPronouncer;
    private String levelOfDifficulty;
	private String isLocked;
    private String isApproved;*/
    
   /* String getIsLocked() {
		return isLocked;
	}
	public void setIsLocked(String isLocked) {
		this.isLocked = isLocked;
	}
	public String getIsApproved() {
		return isApproved;
	}
	public void setIsApproved(String isApproved) {
		this.isApproved = isApproved;
	}
*/
    
    
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	/*public String getActualWord() {
		return actualWord;
	}
	public void setActualWord(String actualWord) {
		this.actualWord = actualWord;
	}
	public String getWordInsertedByPronouncer() {
		return wordInsertedByPronouncer;
	}
	public void setWordInsertedByPronouncer(String wordInsertedByPronouncer) {
		this.wordInsertedByPronouncer = wordInsertedByPronouncer;
	}
	public Word() {}

    public Word(String id, String actualWord, String wordInsertedByPronouncer,
    		String levelOfDifficulty, String isLocked, String isApproved) {
        this.id = id;
        this.actualWord = actualWord;
        this.wordInsertedByPronouncer = wordInsertedByPronouncer;
        this.levelOfDifficulty=levelOfDifficulty;
        this.isLocked= isLocked;
        this.isApproved = isApproved;
    }
    */
	@Override
    public String toString() {
        return String.format(
                "Word[id=%s, actualWord='%s', prouncerWord='%s']",
                id, actualWord, prouncerWord);
    }
	
}
