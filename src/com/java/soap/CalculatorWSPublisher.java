package com.java.soap;

import javax.xml.ws.Endpoint;

public class CalculatorWSPublisher {

	public static void main(String[] args) {
		CalculatorIfc calculator=new Calculator();
		Endpoint.publish("http://localhost:8085/ws/calculator", calculator);
		System.out.println("End Point has been published!!!");
	}
}