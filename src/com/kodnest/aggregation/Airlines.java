package com.kodnest.aggregation;

public class Airlines {
	String airname;
	Pilot pilot;
	public Airlines(String airname,Pilot pilot)
	{    this.airname=airname;
		this.pilot=pilot;
	}
	void operate()
	{
		System.out.println(airname + "operating");
		pilot.fly();
	}

}
