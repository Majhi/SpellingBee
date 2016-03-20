package com.wordsmith.util;
import org.springframework.data.repository.CrudRepository;

import com.wordsmith.domain.Word;


public interface WordRepository extends CrudRepository<Word, Integer>{
}
