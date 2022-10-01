package com.c202001090145.oyh.controller;

import com.c202001090145.oyh.pojo.Book;
import com.c202001090145.oyh.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class bookInfoController {
    @Autowired
    BookService bookService;

    @RequestMapping("addbook")
    public String addbook(){

        return "addbook";
    }

    @RequestMapping("addbookcommit")
    public String addbookcommit(Model model, float price, String name){
        bookService.addBooks(price,name);
        return "forward:/booklist";
    }
    @RequestMapping("booklist")
    public String booklist(Model model){
        model.addAttribute("bookList",bookService.getAllBooks());
        return "booklist";
    }
    @RequestMapping("updatebook")
    public String updatebook(Model model,Book book){
        model.addAttribute(book);
        return "updatebook";
    }
    @RequestMapping("updatebookcommit")
    public String updatebookcommit(Model model,Book book){
        bookService.updatebook(book);
        return "forward:/booklist";
    }
    @RequestMapping("delete")
    public String delete(int id){
        bookService.delete(id);
          return "forward:/booklist";
    }
}
