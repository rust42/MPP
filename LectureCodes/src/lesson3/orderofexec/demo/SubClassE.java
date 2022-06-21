package lesson3.orderofexec.demo;

public class SubClassE extends ClassE {
	static int subInt = subIntMethod();
	static int subIntMethod(){
		return 2;
	}
	
	static {
		System.out.println("static block");
	}

	
	static int subInstanceIntMethod() {
		return 3;
	}
	
	//constructor
	SubClassE(){
		System.out.println("subclass constructor");
	}
	
	
	
	{
		System.out.println("object initialization block");
	}
	
	
	@SuppressWarnings("unused")
	private int subInstanceInt = subInstanceIntMethod();
		
}

