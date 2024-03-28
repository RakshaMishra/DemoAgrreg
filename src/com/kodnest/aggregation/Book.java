package com.kodnest.aggregation;

public class Book {
	Page p;
	public Book(String content)
	{
		this.p=new Page(content);
	}
	void readPage()
	{
		System.out.println("reading page");
	}

}
