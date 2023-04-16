package inheritance;

public class Animal {
	public String s1,s2;
    Animal(Animal ob)
    {
    	s1 = ob.s1;
    	s2 = ob.s2;
    	
    	System.out.println("BD BD");
    }
	
	Animal(String s1,String s2){
		this.setS1(s1);
		this.setS2(s2);
	}
	
	void talk()
	{
		System.out.println("talk");
	}
	void name()
	{
		System.out.println(getS1()+" and "+ getS2()+" are two animal");
	}

	public String getS1() {
		return s1;
	}

	public void setS1(String s1) {
		this.s1 = s1;
	}

	public String getS2() {
		return s2;
	}

	public void setS2(String s2) {
		this.s2 = s2;
	}

}
