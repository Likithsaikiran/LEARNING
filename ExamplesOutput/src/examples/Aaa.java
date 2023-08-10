package examples;

public class Aaa {
	Aaa(){
		this(20);
		System.out.println(0);
	}
	Aaa(int a){
		this(90.90f);
		System.out.println("6");
		
	}
	Aaa(float a){
		this(90.90);
		System.out.println(12);
	}
	Aaa(double a){
		System.out.println(17);
	}

	public static void main(String[] args) {
		new Aaa();

	}

}
