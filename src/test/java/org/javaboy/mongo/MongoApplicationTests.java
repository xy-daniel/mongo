package org.javaboy.mongo;

import org.javaboy.mongo.bean.Book;
import org.javaboy.mongo.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;

@SpringBootTest
class MongoApplicationTests {

    @Autowired
    BookDao bookDao;

    @Test
    void contextLoads() {
    }

    @Test
    void insert() {
        Book s = new Book();
        s.setId(2);
        s.setName("西游记");
        s.setAuthor("吴承恩");
        Book insert = bookDao.insert(s);
        System.out.println(insert);
    }

    @Test
    void select() {
        List<Book> all = bookDao.findAll();
        System.out.println(all);
    }

    @Test
    void findBookByNameContaining(){
        List<Book> name = bookDao.findBookByNameContaining("name");
        System.out.println(name);
    }

    @Autowired
    MongoTemplate mongoTemplate;

    @Test
    void test(){
        Book book = new Book();
        book.setId(3);
        book.setName("红楼梦");
        book.setAuthor("曹雪芹");
        mongoTemplate.insert(book);
        System.out.println(mongoTemplate.findAll(Book.class));;
    }

}
