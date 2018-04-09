package javaBasics;

public class TestConstructor2 {
	int a;
	int b;
	int c;

	TestConstructor2(){
		System.out.println("I am from default Constructor");
		
	}
	TestConstructor2(int a){
		this.a=a;
		System.out.println("Value of a="+a);
	}
	TestConstructor2(String a){
		System.out.println("I am from string Constructor");
	
	}
	TestConstructor2(int a, int b, int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	void display() {
		
		System.out.println("print values of "+a+","+b+","+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestConstructor2 obj=new TestConstructor2 (2,3,4);
		obj.display();
		TestConstructor2 obj1=new TestConstructor2 ("BHANU");
		obj.display();
	}

}
