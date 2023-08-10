package examples;

public class Quiz {
	static {
		System.out.println("SB");
	}
	Quiz(){
		System.out.println("Con");
	}
	{
		System.out.println("IB");
	}


	public static void main(String[] args) {
		Quiz obj =new Quiz();

	}
}



