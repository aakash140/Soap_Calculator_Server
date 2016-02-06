package com.java.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface CalculatorIfc {

	@WebMethod
	public int add(int num1,int num2);
	
	@WebMethod
	public int subtract(int num1,int num2);
	
	@WebMethod
	public int multiply(int num1,int num2);
	
	@WebMethod
	public float divide(int num1,int num2);
}