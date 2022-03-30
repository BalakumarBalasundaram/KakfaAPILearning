package org.bk.javalearnapi.datetime;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Timestamp;
import java.time.Instant;

public class UtilTimeOperation {
    public static final Logger logger = LogManager.getLogger(UtilTimeOperation.class);

    public static void main(String[] args) {
        Timestamp instant = Timestamp.from(Instant.now());
        logger.info("current time is {}", instant);
    }

}
