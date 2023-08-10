package examples;

public class A {
	int i=m1();
	int m1() {
		System.out.println("m1");
		return 20;
	}
	int m2() {
		System.out.println("m2");
		return 10;
		
	}
	{
		System.out.println("IB");
	}
	int j=m2();
	

	public static void main(String[] args) {
		A obj=new A();

	}

}
