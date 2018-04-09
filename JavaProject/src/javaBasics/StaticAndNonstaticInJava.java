package javaBasics;

public class StaticAndNonstaticInJava {
	int i;
	int j;
	static int p;
	static int k;
	public void test1(){
		System.out.println("Test1 is nonstatic");
		
	}
	public static void test2(){
		System.out.println("Test2 is static");
		
	}
	public void test3(){
		System.out.println("Test3 is nonstatic");
		
	}
	public static void test4(){
		System.out.println("Test4 is static");
		
	}
	public static void main(String[] args) {
		StaticAndNonstaticInJava obj= new StaticAndNonstaticInJava();
		obj.test1();
		obj.test3();
		System.out.println(obj.i);
		System.out.println(obj.j);
		StaticAndNonstaticInJava.test2();
		StaticAndNonstaticInJava.test4();
		System.out.println(StaticAndNonstaticInJava.p);
		System.out.println(StaticAndNonstaticInJava.k);
	}

}
