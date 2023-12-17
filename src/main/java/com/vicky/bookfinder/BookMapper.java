package com.vicky.bookfinder;

import com.vicky.bookfinder.entity.Book;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookMapper implements RowMapper<Book> {
    @Override
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
        int id = rs.getInt(1);
        String name = rs.getString(2);
        String author = rs.getString(3);
        String created = rs.getString(4);
        return new Book(id, name, author, created);
    }
}
