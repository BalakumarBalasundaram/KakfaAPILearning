# KakfaAPILearning

Quick Kafka API to refer

Package:
 - org.apache.kafka.clients.producer

Class:
 - KafkaProducer
 - ProducerRecord
 - RecordMetadata

```
KafkaProducer:
        Properties props = new Properties();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, Commons.EXAMPLE_KAFKA_SERVER);
        props.put(ProducerConfig.CLIENT_ID_CONFIG, "KafkaProducerExample");
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        KafkaProducer<> producer = new KafkaProducer<>(props);

ProducerRecord & RecordMetadata:
        ProducerRecord<String, String> record = new ProducerRecord<>(Commons.EXAMPLE_KAFKA_TOPIC, uuid, word);
        RecordMetadata metadata = producer.send(record).get();
´´´