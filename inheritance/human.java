package inheritance;

public class human extends Animal {
	
	String hum;
	
	public human(String s,String s2,String s3)
	{
		super(s,s2);
		hum = s3;
	}
	public human(human ob)
	{
		super(ob);
		hum = ob.hum;
	}
	
	void walk()
	{
		System.out.println("human can walk");
	}
	void play()
	{
		System.out.println("can play");
	}
	void play(String s)
	{
		System.out.println(s+" cannot paly");
	}
//	void nai()
//	{
//		System.out.println(s1);
//	}
//	

}

