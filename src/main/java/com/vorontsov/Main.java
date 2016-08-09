package com.vorontsov;

import com.vorontsov.pojo.Book;
import com.vorontsov.service.BookService;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class Main {
    public static void main(String[] args){
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();

        BookService bookService = container.instance().select(BookService.class).get();

        Book book = bookService.createBook("TEst", 12.4f, "Spme title");
        System.out.println(book);

        weld.shutdown();
    }
}
