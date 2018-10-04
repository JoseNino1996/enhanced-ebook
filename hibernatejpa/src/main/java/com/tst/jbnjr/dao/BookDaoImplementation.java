package com.tst.jbnjr.dao;

import com.tst.jbnjr.model.Book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;
import java.util.List;

public class BookDaoImplementation implements IBookDao {



    @Override
    public void save(Book book) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnit");
        EntityManager entityManager = factory.createEntityManager();
        if(book.getId() == null) {
            create(book);
        } else {
            Book foundBook  = findById(book.getId());
            entityManager.getTransaction().begin();
            book.setId(foundBook.getId());
            entityManager.merge(book);

            entityManager.getTransaction().commit();
            entityManager.close();
            factory.close();
        }



    }
    private void create(Book book) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnit");
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();

        book.setName(book.getName());
        book.setPage(book.getPage());
        book.setPublished(new Date());

        entityManager.persist(book);
        entityManager.getTransaction().commit();
        entityManager.close();

        factory.close();
    }


    @Override
    public Book findById(Long id) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnit");
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();

        Book book = entityManager.find(Book.class, id);


        entityManager.getTransaction().commit();
        entityManager.close();

        factory.close();
        return book;
    }
    @Override
    public void delete(long id) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnit");
        EntityManager entityManager = factory.createEntityManager();

        entityManager.getTransaction().begin();

        Book book = entityManager.find(Book.class, id);

        entityManager.remove(book);

        entityManager.getTransaction().commit();
        entityManager.close();

        factory.close();
    }



}
