package com.vorontsov.service.generators;

import com.vorontsov.annotation.EightDigits;
import com.vorontsov.interfaces.NumberGenerator;
import com.vorontsov.log.Loggable;

import javax.inject.Inject;
import java.util.Random;
import java.util.logging.Logger;

@EightDigits
public class IssnGenerator implements NumberGenerator{
    @Inject
    private Logger logger;

    @Loggable
    public String generateNumber() {
        String issn = "8-" + Math.abs(new Random().nextInt());
        logger.info("Generated ISSN:" + issn);
        return issn;
    }
}
