package com.rvittori.database_postgresql_jdbc.dao;


import com.rvittori.database_postgresql_jdbc.domain.Book;

import java.util.List;
import java.util.Optional;

public interface BookDao {

    void create(Book book);

    Optional<Book> findOne(String isbn);

    List<Book> find();

    void update(String isbn, Book book);
}
