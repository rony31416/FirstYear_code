package inheritance;

public class Main  {
	public static void main(String[] args)
	{
		human hu = new human("dog","cat","Rony");
		System.out.println(hu.hum+" java xm ase");
		
		//hu.walk();
		//hu.play();
		//hu.talk();
		//hu.name();
		//hu.play("fish");
		
		Animal animal = new Animal(hu);
		
	   
		//animal.talk();
		
		System.out.println(animal.getS1()+" can not fly");
		System.out.println(animal.getS2()+" can fly");
		
		
		
	}
}
