package com.kodnest.aggregation;

public class Pilot {
	String name;
	int age;
	public Pilot(String name,int age) {
		this.name=name;
		this.age=age;
	}
	void fly() {
		System.out.println(name +age+"is flying the plane");
	}

}
