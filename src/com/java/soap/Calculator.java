package com.java.soap;

import javax.jws.WebService;

@WebService(endpointInterface="com.java.soap.CalculatorIfc")
public class Calculator implements CalculatorIfc{

	public int add(int num1,int num2){
		return num1+num2;
	}

	/**
	 * @param num1
	 * @param num2
	 * @return int Returns num1-num2 
	 */
	public int subtract(int num1,int num2){
		return (num1-num2);
	}

	public int multiply(int num1,int num2){
		return num1*num2;
	}

	public float divide(int num1,int num2){
		return num1/num2;
	}
}