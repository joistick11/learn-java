package com.vorontsov.test;

import com.vorontsov.pojo.Book;
import com.vorontsov.service.BookService;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BookServiceIT {
    @Test
    public void shouldCheckNumberIsMock(){
        Weld weld = new Weld();
        WeldContainer weldContainer = weld.initialize();

        BookService bookService = weldContainer.instance().select(BookService.class).get();

        Book book = bookService.createBook("Some", 12.3f, "BLAH");

        assertTrue(book.getNumber().startsWith("MOCK"));

        weld.shutdown();
    }
}
