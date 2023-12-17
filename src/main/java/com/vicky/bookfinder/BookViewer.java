package com.vicky.bookfinder;

import com.vicky.bookfinder.dto.BookRequest;
import com.vicky.bookfinder.dto.BookResponse;
import com.vicky.bookfinder.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class BookViewer {

    // HAS A Relationship or Dependency
    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public List<BookResponse> getBooks() {
        List<Book> books = jdbcTemplate.query("select * from book", new BookMapper());

        return books.stream()
                .map(book -> new BookResponse(book.getName(), book.getAuthor()))
                .collect(Collectors.toList());
    }

    @RequestMapping(value = "/books", method = RequestMethod.POST)
    public String addBook(@RequestBody BookRequest bookRequest) {
        jdbcTemplate.update("insert into book (name, author) values (?, ?)", bookRequest.getName(),
                bookRequest.getAuthor());
        return "record created successfully";
    }


}
