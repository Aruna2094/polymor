package org.overload;

public class Overload {
	
	private void add(String name) {
	  System.out.println("my name is "+name);
    }
	private void add(String name1,int num) {
		System.out.println(("my name is "+name1+"my age is "+num));
    }
	
	private void add(String name2,int num1,String deg,long pho) {
		System.out.println("my name is "+name2+ "my age is "+num1+"/n my degree is "+deg+"/n my phone number is "+pho);

	}
	public static void main(String[] args) {
		Overload o=new Overload();
		o.add("Aruna");
		o.add("Aruna", 28);
		o.add("Aruna", 28, "BE", 9698489994l);
	}

}
