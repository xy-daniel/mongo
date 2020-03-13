package org.javaboy.mongo.dao;

import org.javaboy.mongo.bean.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BookDao extends MongoRepository<Book, Integer> {
    //仿造Jpa
    List<Book> findBookByNameContaining(String name);
}
