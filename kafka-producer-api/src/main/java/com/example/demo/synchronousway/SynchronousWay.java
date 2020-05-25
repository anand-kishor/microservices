package com.example.demo.synchronousway;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

public class SynchronousWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String topic="SychronousTopicTest";
		String key="Key";
		String value="Value-1";
		Properties props=new Properties();
		props.put("bootstrap-servers", "localhost:9092,localhost:9093");
		props.put("key-serializer", "org.apache.kafka.common.serialization.StringSerializer");
		props.put("value-serializer", "org.apache.kafka.common.serialization.StringSerializer");
		Producer<String,String> producer=new KafkaProducer<>(props);
		ProducerRecord<String,String> record=new ProducerRecord<>(topic,key,value);
		try {
			RecordMetadata metadata=producer.send(record).get();
			System.out.println("message is send partion to "+metadata.partition()+"and offset "+metadata.offset());
			System.out.println("SynchronousWay message is completetly send");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("synchronous producer send message exception ");
		}
		finally
		{
			producer.close();
		}

	}

}
