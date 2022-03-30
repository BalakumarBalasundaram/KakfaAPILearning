package org.bk.kafkalearnapi.simpleproducer;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Properties;
import java.util.concurrent.ExecutionException;

public class StringKeyValueProducer {

    private static final Logger logger = LogManager.getLogger(StringKeyValueProducer.class);

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Properties props = new Properties();
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, "");
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "");
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "");
        props.put(ProducerConfig.CLIENT_ID_CONFIG, "");
        KafkaProducer<String, String> strProducer = new KafkaProducer<>(props);
        ProducerRecord<String, String> record = new ProducerRecord<>("topic1", "uuid", "101");
        RecordMetadata recordMeta =  strProducer.send(record).get();
        logger.info("record sent successfully @ metadata {}.", recordMeta.timestamp());
    }

}
