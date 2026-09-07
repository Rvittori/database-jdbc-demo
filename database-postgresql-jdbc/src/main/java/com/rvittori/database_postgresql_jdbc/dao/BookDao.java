package com.rvittori.database_postgresql_jdbc.dao;


import com.rvittori.database_postgresql_jdbc.domain.Book;

import java.util.Optional;

public interface BookDao {

    void create(Book book);

    Optional<Book> find(String isbn);
}
