package com.vorontsov.generator;

import com.vorontsov.annotation.ThirteenDigits;
import com.vorontsov.interfaces.NumberGenerator;
import com.vorontsov.log.Loggable;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import java.util.logging.Logger;

@Alternative
@ThirteenDigits
public class MockGenerator implements NumberGenerator {
    @Inject
    private Logger logger;

    @Loggable
    public String generateNumber() {
        String mock = "MOCK-" + "jopa";
        logger.info("Generated mock: " + mock);
        return mock;
    }
}
