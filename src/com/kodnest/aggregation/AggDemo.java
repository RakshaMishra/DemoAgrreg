package com.kodnest.aggregation;
import java.util.Scanner;
public class AggDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		int age=sc.nextInt();
		Pilot pilot=new Pilot(name,age);
		Airlines airlines=new Airlines("indigo",pilot);
		airlines.operate();
		airlines=null;
		pilot.fly();
	}

}
