package project_1116;

public class p09 {
	public static void main(String[] args)	
	{
		Car2 car1 = new Car2();
		
		car1.num=1234;
		car1.gas=20.5;
	}
}
class Car2
{
	int num;
	double gas;
	
	void show() 
	{
	System.out.println("車號是"+this.num);
	System.out.println("汽油量是"+this.gas);
	}
}