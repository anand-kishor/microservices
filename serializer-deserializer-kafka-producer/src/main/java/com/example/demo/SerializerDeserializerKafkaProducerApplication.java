package com.example.demo;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SerializerDeserializerKafkaProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SerializerDeserializerKafkaProducerApplication.class, args);
		
		String topic="SensorTopicTest";
		//String key="Key";
		//String value="Value-1";
		Properties props=new Properties();
		props.put("bootstrap-servers", "localhost:9092,localhost:9093");
		props.put("key-serializer", "org.apache.kafka.common.serialization.StringSerializer");
		props.put("value-serializer", "org.apache.kafka.common.serialization.StringSerializer");
		props.put("partitioner.class", "SensorPartitioner");
		props.put("speed.sensor.name", "TSS");
		Producer<String,String> producer=new KafkaProducer<>(props);
		//ProducerRecord<String,String> record=new ProducerRecord<>(topic,key,value);
		for(int i=0;i<10;i++)
		producer.send(new ProducerRecord<>(topic,"SSP"+i,"500 "+i));
		for(int i=0;i<10;i++)
			producer.send(new ProducerRecord<>(topic,"TSS","500 "+i));
		producer.close();
		System.out.println("Simple producer completed");
	}

}
