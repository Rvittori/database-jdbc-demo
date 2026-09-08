package com.rvittori.database_postgresql_jdbc;

import com.rvittori.database_postgresql_jdbc.domain.Author;
import com.rvittori.database_postgresql_jdbc.domain.Book;

public final class TestDataUtil {

    private TestDataUtil() {

    }


    public static Author createTestAuthor() {
        return Author.builder()
                .id(1L)
                .name("Jane Doe")
                .age(50)
                .build();
    }

    public static Book createTestBook() {
        return Book.builder()
                .isbn("978-1-2345-6789-0")
                .title("The Shadow in the Attic")
                .authorId(1L)
                .build();
    }
}
