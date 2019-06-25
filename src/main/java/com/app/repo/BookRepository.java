package com.app.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.documents.Book;

public interface BookRepository extends MongoRepository<Book, String> {

}
