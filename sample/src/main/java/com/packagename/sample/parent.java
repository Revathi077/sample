package com.packagename.sample;

import org.springframework.stereotype.Service;

@Service
public class parent implements parentinterface,Secondparent{
	@Override
	public String getresults()
	{
		System.out.println("hello");
		String a="good";
		return a;
	}
	@Override
	public String printt()
	{
		System.out.println("hello");
		String a="aa";
		return a;
	}
	public void getnames(int number)
	{
	System.out.print(number);	
	}
	public void getnames(String name)
	{
		System.out.println(name);
	}
	public void getnames()
	{
		System.out.println("parenthello");
	}


}
