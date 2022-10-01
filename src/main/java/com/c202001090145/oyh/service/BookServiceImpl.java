package com.c202001090145.oyh.service;


import com.c202001090145.oyh.dao.BookDao;
import com.c202001090145.oyh.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

//    写完service写controller层
    @Autowired
    BookDao bookDao;
    public void addBooks(float price, String name) {

        bookDao.addBooks(price,name);
    }

    public List<Book> getAllBooks() {

        return bookDao.getAllBooks();
    }
    public void updatebook(Book book){
        bookDao.updatebook(book);
    }

    public void delete(int id) {
        bookDao.delete(id);
    }
}
