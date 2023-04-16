package inheritance;

public class car extends vehicle {
	
	int numoftire ;
	
	 car(int i) {
		super(i);
	}

	void start()
	{
		
		System.out.println("start with key");
	}

}
