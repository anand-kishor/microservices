package com.example.demo;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaProducerApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaProducerApiApplication.class, args);
		String topic="SimpleTopicTest";
		String key="Key";
		String value="Value-1";
		Properties props=new Properties();
		props.put("bootstrap-servers", "localhost:9092,localhost:9093");
		props.put("key-serializer", "org.apache.kafka.common.serialization.StringSerializer");
		props.put("value-serializer", "org.apache.kafka.common.serialization.StringSerializer");
		Producer<String,String> producer=new KafkaProducer<>(props);
		ProducerRecord<String,String> record=new ProducerRecord<>(topic,key,value);
		producer.send(record);
		producer.close();
		System.out.println("kafka send message");
		
	}

}
