package com.vorontsov.service.generators;

import com.vorontsov.annotation.ThirteenDigits;
import com.vorontsov.interfaces.NumberGenerator;
import com.vorontsov.log.Loggable;

import javax.inject.Inject;
import java.util.Random;
import java.util.logging.Logger;

@ThirteenDigits
public class IsbnGenerator implements NumberGenerator {
    @Inject
    Logger logger;

    @Loggable
    public String generateNumber() {
        String isbn = "13-84356-" + Math.abs(new Random().nextInt());
        logger.info("Generated ISBN: " + isbn);
        return isbn;
    }
}
