package org.bk.kafkastreamslearnapi;

import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.KTable;

import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;

public class SimpleKafkaStreamsHighLevelApi {

    public static void main(String[] args) {

        StreamsBuilder streamsBuilder = new StreamsBuilder();

        KStream<String, String> textLines = streamsBuilder.stream("topic1");

        Pattern pattern = Pattern.compile("\\W+", Pattern.UNICODE_CHARACTER_CLASS);

        KTable<String, Long> wordCounts = textLines
                .flatMapValues(value -> Arrays.asList(pattern.split(value.toLowerCase())))
                .groupBy((key,word) -> word)
                .count();



    }
}
