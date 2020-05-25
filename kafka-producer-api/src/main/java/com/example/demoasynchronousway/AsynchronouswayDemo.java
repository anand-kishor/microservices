package com.example.demoasynchronousway;

import java.util.Properties;

import org.apache.kafka.clients.producer.Callback;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;

public class AsynchronouswayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String topic="AsychronousTopicTest";
		String key="Key";
		String value="Value-1";
		Properties props=new Properties();
		props.put("bootstrap-servers", "localhost:9092,localhost:9093");
		props.put("key-serializer", "org.apache.kafka.common.serialization.StringSerializer");
		props.put("value-serializer", "org.apache.kafka.common.serialization.StringSerializer");
		Producer<String,String> producer=new KafkaProducer<>(props);
		ProducerRecord<String,String> record=new ProducerRecord<>(topic,key,value);
		producer.send(record, new MyCallBackMethod());
		System.out.println("Asynchronous call success!");
		producer.close();

	}
}
class MyCallBackMethod implements Callback {

		@Override
		public void onCompletion(RecordMetadata metadata, Exception exception) {
			// TODO Auto-generated method stub
			if(exception !=null)
				System.out.println("asynchronous way send faield message");
			else
				System.out.println("asyochronous callback success");

		}

}
