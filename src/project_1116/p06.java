package project_1116;

public class p06 {
	public static void main(String[] args)	
	{
		Car0 car1 = new Car0();
		
		car1.num=1234;
		car1.gas=20.5;
		
		System.out.println("車號是"+car1.num);
		System.out.println("汽油量是"+car1.gas);
	}
}
class Car0
{
	int num;
	double gas;
}
