package com.wordsmith.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Word {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
		private String id;
		private String actualWord;
		private String prouncerWord;
		private String difficulty;
		private String locked;
		public String getDifficulty() {
			return difficulty;
		}



		public void setDifficulty(String difficulty) {
			this.difficulty = difficulty;
		}



		public String getLocked() {
			return locked;
		}



		public void setLocked(String locked) {
			this.locked = locked;
		}
		private String status;
		      
	
	public String getActualWord() {
		return actualWord;
	}

	

	public void setActualWord(String actualWord) {
		this.actualWord = actualWord;
	}

	
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
	@Override
    public String toString() {
        return String.format(
                "Customer[id=%s, actualWord='%s', wordInsertedByPronouncer='%s', "
                + "levelOfDifficulty='%s',isLocked='%s',isApproved='%s',]",
                id, actualWord, wordInsertedByPronouncer, levelOfDifficulty, isLocked, isApproved);
    }
	
*/}
