package org.overload;

public class OverrideB extends OverrideA {
	
	private void divs() {
      
		for(int i=1;i<1001;i++) {
  	      if(i % 10 == 0) 
			System.out.println(i);
  	      }
		}
	
   @Override
	public void adds(int a, int b) {
		 int c=a*b;
		 System.out.println(c);
		}
   @Override
    public void subs(int b, int a) {
	  int n=b+a;
	  System.out.println(n);
   }
	
   public static void main(String[] args) {
	OverrideB b=new OverrideB();
	b.divs();
	b.adds(10, 10);
	b.subs(100, 100);
	//upcasting
	OverrideA a=new OverrideB();
	a.adds(10, 10);
	a.subs(100, 100);
	
}
}