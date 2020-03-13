package org.javaboy.mongo.dao;

import org.javaboy.mongo.bean.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookDao extends MongoRepository<Book, Integer> {

}
