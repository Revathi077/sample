package com.packagename.sample;

import java.util.Scanner;

public class If_test {
	
	@SuppressWarnings("resource")
	void getblood_group()
	{
		int number=1;
		if(number==1)
		{
			//String blood_group="z";
		System.out.println("enter blood-group");
		Scanner blood_g=new Scanner(System.in);
		String blood_group=blood_g.nextLine();
		System.out.println(blood_group);
	            if(blood_group=="a"||blood_group=="b"||blood_group=="c")
	             System.out.println("general blood-group"+blood_group); 
	            else
	            {
	            	 System.out.println("special blood group");
	            }
	    }
	    else
		{
		  System.out.println("try again");
		} 
		
		
	}

	public static void main(String[] args) {
		If_test b=new If_test ();
		b.getblood_group();
	}

}
