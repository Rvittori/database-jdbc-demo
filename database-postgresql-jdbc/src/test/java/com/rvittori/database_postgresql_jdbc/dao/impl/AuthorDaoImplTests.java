package com.rvittori.database_postgresql_jdbc.dao.impl;

import com.rvittori.database_postgresql_jdbc.domain.Author;
import com.rvittori.database_postgresql_jdbc.impl.AuthorDaoImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.jdbc.core.JdbcTemplate;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class AuthorDaoImplTests {

        @Mock
        private JdbcTemplate jdbcTemplate;

        @InjectMocks
        private AuthorDaoImpl underTest;

        @Test
        public void testThatCreateAuthorGeneratesTheCorrectSql() {
            Author author = Author.builder()
                    .id(1L)
                    .name("Jane Doe")
                    .age(50)
                    .build();

            underTest.create(author);

            verify(jdbcTemplate).update(
                    eq ("INSERT INTO authors (id, name, age) VALUES (?, ?, ?)"),
                    eq(1L), eq("Jane Doe"), eq(50)
                    );
        }

    @Test
    public void testThatFindOneGeneratesTheCorrectSql() {
        underTest.findOne(1L);
        verify(jdbcTemplate).query(
                eq("SELECT id, name, age FROM authors WHERE id = ? LIMIT 1"),
                ArgumentMatchers.<AuthorDaoImpl.AuthorRowMapper>any(),
                eq(1L)
        );
    }

}

