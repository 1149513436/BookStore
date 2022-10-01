package com.c202001090145.oyh.dao.Impl;

import com.c202001090145.oyh.dao.BookDao;
import com.c202001090145.oyh.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class bookDaoImpl implements BookDao {

    @Autowired
    JdbcTemplate jdbcTemplate;
//    写完dao就写service层
    public void addBooks(float price, String name) {
        jdbcTemplate.update("insert into bookinfo values (null,?,?)",name,price);
    }

    public List<Book> getAllBooks() {
        RowMapper<Book> rowMapper=new BeanPropertyRowMapper<Book>(Book.class);
      List<Book>bookList= jdbcTemplate.query("select * from bookinfo",rowMapper);
        return bookList;
    }

    public void updatebook(Book book) {
        jdbcTemplate.update("update bookinfo set name=?,price=? where id=?",book.getName(),book.getPrice(),book.getId());
    }
    public void delete (int id){
        jdbcTemplate.update("delete from bookinfo where id=?",id);
    }
}
