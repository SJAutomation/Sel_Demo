package javaPrgm;

public class Method_overload {

	
	
	void m1()
	{
		System.out.println("I am in method1");
	}
	
	
	void m1(int a)
	{
		//int x=a;
		System.out.print("Value of a is:");
		System.out.println(a);
	}
	
	void m1(int a,int b)
	{
		//int x=a;
		System.out.print("Value of a and b  is:");
		System.out.println(a);
		System.out.println(b);
	}
	
	
	
	
	void m1(int a,double b)
	{
		//int x=a;
		System.out.print("Value of a and b  is:");
		System.out.println(a);
		System.out.println(b);
	}
	

	void m1(double b,int a)   ///order of args-different
	{
		//int x=a;
		System.out.print("Value of a and b  is:");
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) 
	{
		
		
		//int x;
		Method_overload m1=new Method_overload();
		
		m1.m1(50,60.0);;

	}
}

