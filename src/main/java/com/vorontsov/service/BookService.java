package com.vorontsov.service;

import com.vorontsov.annotation.ThirteenDigits;
import com.vorontsov.interfaces.NumberGenerator;
import com.vorontsov.log.Loggable;
import com.vorontsov.pojo.Book;

import javax.inject.Inject;

@Loggable
public class BookService {
    @Inject @ThirteenDigits
    private NumberGenerator numberGenerator;

    public Book createBook(String title, Float price, String description){
        Book book = new Book(title, price, description);
        book.setNumber(numberGenerator.generateNumber());

        return book;
    }
}
