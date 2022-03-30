package org.bk.javalearnapi.args;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class UtilProperties {

    public static final Logger logger = LogManager.getLogger(UtilProperties.class);

    public static void main(String[] args) throws IOException {

        Properties props = new Properties();
        InputStream input = UtilProperties.class.getClassLoader().getResourceAsStream("config.properties");
        props.load(input);

        logger.info("topic name : {} ", props.getProperty("topicName"));

    }
}
