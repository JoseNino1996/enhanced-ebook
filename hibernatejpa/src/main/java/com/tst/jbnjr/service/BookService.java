package com.tst.jbnjr.service;

import com.tst.jbnjr.dao.IBookDao;
import com.tst.jbnjr.model.Book;


import java.util.List;


public class BookService {


    private IBookDao iBookDao;


    public BookService(IBookDao bookDao) {
        iBookDao = bookDao;
    }
    public void save(Book book) {
        iBookDao.save(book);
    }

    public Book findById(Long id) {
        return iBookDao.findById(id);
    }

    public void delete(Long id) {
        iBookDao.delete(id);
    }


}
