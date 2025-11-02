package javaPrgm;

public class this_keyword {

	public static void main(String[] args) {
		this_keyword t=new this_keyword();
		t.m1(50,60);
		t.m1(510,60);
		
    
   // int x,y;
   
	}

      int x=10;
	 int y=50;
	
	
	 void m1(int x,int y)
	    {
	    	this.x=x;
	    	this.y=y;
	    	System.out.println(x);
	    	System.out.println(y);
	    	
	    	
	    }
	 
	 
	 void m11(int a,int b)
	    {
	    	x=a;
	    	y=b;
	    	System.out.println(a);
	    	System.out.println(b);
	    	
	    	
	    }



}
