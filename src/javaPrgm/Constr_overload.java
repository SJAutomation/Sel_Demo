package javaPrgm;

public class Constr_overload {

	public static void main(String[] args) {
		
		
		
		Constr_overload c=new Constr_overload(50);
		
	}
      
	int a=40;
	
	Constr_overload()
	{
		System.out.println("I am in constructor withot arg...");
	}
	
	Constr_overload(int a)
	{
		this.a=a;
		System.out.println("I am in constructor withot 1 arg...");
		System.out.println(a);
	}
	
	Constr_overload(int a,int b)
	{
		//a=10;
		//b=20;
		
		System.out.println("I am in constructor withot 1 arg...");
		System.out.println(a);
		System.out.println(b);
	}
	
}
