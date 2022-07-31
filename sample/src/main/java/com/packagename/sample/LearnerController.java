package com.packagename.sample;

class a{
	
	
	a(){
			System.out.print("hello constructor");
		
		
	}
	final int a=10;
	void get()
	{ 
	System.out.println("hello get");
	}
	}
class b extends a{
	//super();
	void set()
	{
		
	System.out.println("hello set");
	System.out.println(super.a);
	}
}
	
	//@Autowired
	
     // Secondparent parentt;
	
	
	/*public  String getdataa()
	{
		return parentt.getresults();
	}*/
	public class LearnerController {
		
	public static void main(String[] args) {
		/*LearnerController  a=new LearnerController();
		//a.getdataa();
		
	//a.parentt.getresults();
		parentinterface b=new parent();
		b.printt();
		Secondparent s=new parent();
		s.getresults();
		//childinterface b=new parent();
		//b.printt();
		b.getnames(10);
		b.getnames("sundar");
		b.getnames();
		parent p=new parent();
		b.getnames(20);
		p.getnames();*/
		b name=new b();
		name.get();
		name.set();
		
		}

}
