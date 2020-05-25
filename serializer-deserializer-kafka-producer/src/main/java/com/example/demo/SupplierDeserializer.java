package com.example.demo;

import org.apache.kafka.common.serialization.Deserializer;

public class SupplierDeserializer implements Deserializer<Supplier> {
	private String encoding="UTF8";

	@Override
	public Supplier deserialize(String topic, byte[] data) {
		// TODO Auto-generated method stub
		int sizeOfName;
		int sizeOfDate;
		byte[] serializedName;
		byte[] serializedDate;
		try
		{
			if(data==null)
				return null;
		
		}
		catch(Exception e)
		{
			
		}
		return null;
	}

}
