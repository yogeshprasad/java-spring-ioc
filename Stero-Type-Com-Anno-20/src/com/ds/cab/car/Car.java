package com.ds.cab.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ds.cab.eng.Engine;

@Component
public class Car {

	@Autowired
	private Engine engine;
		

	public void printData(){

		System.out.println("Model-Year " + engine.getModelyear());
		
	}
}
