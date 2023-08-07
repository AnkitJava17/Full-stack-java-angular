package com.spring.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.spring.mongo.model.Note;

public interface INoteRepository extends MongoRepository<Note, Integer> {

}
