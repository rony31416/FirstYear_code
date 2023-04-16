package inheritance;

public class vehicle_start {
	public static void main(String[] args) {

		car gari = new car(4);
		skuty bike = new skuty(2);
		//vehicle v = new vehicle();
		
		vehicle v;
		v = gari;
		v.start();
		System.out.println("car : number of tire is : "+v.numoftire);
		
		v = bike;
		v.start();
		System.out.println("schooty : number of tire is : "+v.numoftire);
		

	}

}
