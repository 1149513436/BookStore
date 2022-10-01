package com.c202001090145.oyh.dao;

import com.c202001090145.oyh.pojo.Book;

import java.util.List;

public interface BookDao {
    public void addBooks(float price,String name);
    public List<Book> getAllBooks();
    public void updatebook(Book book);
    public void delete (int id);
}
