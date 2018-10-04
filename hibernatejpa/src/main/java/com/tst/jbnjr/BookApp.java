package com.tst.jbnjr;

import com.tst.jbnjr.dao.BookDaoImplementation;
import com.tst.jbnjr.model.Book;
import com.tst.jbnjr.service.BookService;

import java.util.Date;

public class BookApp {


    public static  void main(String[] args) {
        BookService bookService = new BookService(new BookDaoImplementation());

//       //Create
//        Book book = new Book();
//        book.setName("The Hobbit");
//        book.setPage(400);
//        book.setPublished(new Date());
//
//        bookService.save(book);
//
//
//
//        //Update
//        Book book1 = new Book();
//        book1.setId(4l);
//        book1.setName("Game of Thrones 7");
//        book1.setPage(500);
//        book1.setPublished(new Date());
//
//        bookService.save(book1);
//
//        //Delete
 //     bookService.delete(4l);
//


        //Read
      System.out.println(bookService.findById(6l));



    }

}
