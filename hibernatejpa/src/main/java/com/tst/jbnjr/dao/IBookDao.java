package com.tst.jbnjr.dao;

import com.tst.jbnjr.model.Book;

import java.util.List;

public interface IBookDao {
    void delete(long id);
    void save(Book book);
    Book findById(Long id);




}
