package project_1116;

public class p11 {
	public static void main(String[] args)	
	{
		Car3 car1 = new Car3();
		
		car1.num=1234;
		car1.gas=20.5;
		
		car1.show();
		car1.show();
	}
}
class Car3
{
	int num;
	double gas;
	
	void show() 
	{
	System.out.println("車號是"+this.num);
	System.out.println("汽油量是"+this.gas);
	}
}