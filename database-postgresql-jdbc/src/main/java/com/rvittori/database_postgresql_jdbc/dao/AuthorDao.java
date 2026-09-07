package com.rvittori.database_postgresql_jdbc.dao;

import com.rvittori.database_postgresql_jdbc.domain.Author;

import java.util.Optional;

public interface AuthorDao {

    void create(Author author);

    Optional<Author> findOne(long l);
}
