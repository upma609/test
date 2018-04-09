package javaBasics;

public class TestConstructor1 {
	int a;
	int b;
	TestConstructor1(){
		System.out.println("I am from Default Constructor");
	}
	TestConstructor1(int a){
		this.a=a;
		System.out.println("I am from Parametrize Constructor");
	}
	TestConstructor1(int a, int b){
		this.a=a;
		this.b=b;
		
	}
	void Display() {
		System.out.println("Print a="+a);
	}
	void Sum() {
		int c= a+b;
		System.out.println("Sum c="+c);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestConstructor1 obj= new TestConstructor1();
		obj.Display();
		TestConstructor1 obj2= new TestConstructor1(5);
		obj2.Display();
		TestConstructor1 obj3= new TestConstructor1(5,10);
		obj3.Sum();
	}

}
