package examples;

public class Aa {
	int i=m1();
	
	Aa(){
		System.out.println("onstructor");
		
	}
	int m1() {
		System.out.println("m1.method");
		return 20;
		
	}
	{
		System.out.println("instance block");
	}

	public static void main(String[] args) {
		Aa obj= new Aa();
		

	}

}
