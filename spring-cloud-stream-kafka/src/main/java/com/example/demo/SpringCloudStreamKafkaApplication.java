package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
//import org.apache.kafka.streams.processor.internals.InternalTopologyBuilder.Sink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
//import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.binder.PollableMessageSource;
//import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
//import org.springframework.core.ParameterizedTypeReference;
//import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.ParameterizedTypeReference;

import com.example.demo.bind.SynSink;
import com.example.demo.model.Employee;

@SpringBootApplication
@EnableBinding({Source.class,SynSink.class})
public class SpringCloudStreamKafkaApplication {
	@Autowired
	private PollableMessageSource pollable;

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudStreamKafkaApplication.class, args);
	}
	/*
	 * @StreamListener("input") public void consumeMessage(Employee emp) {
	 * System.out.println(emp); }
	 * 
	 */
	@Bean
	public ApplicationRunner getRunner()
	{
		return args ->{
			
			try {
			while(true)
			{
				if(!pollable.poll(m -> System.out.println(m.getPayload()),new ParameterizedTypeReference<Employee>() {}))
			
             {
Thread.sleep(5000);	
}
			}			}
	catch(Exception e)
	{
		System.out.println("error "+e.getMessage());
	}
	};
	
}
}