package project_1116;

public class p07 {
	public static void main(String[] args)	
	{
		Car1 car1 = new Car1();
		
		car1.num=1234;
		car1.gas=20.5;
		
		Car1 car2 = new Car1();
		
		car2.num = 2345;
		car2.gas = 30.5;
		
		System.out.println("car1車號是"+car1.num);
		System.out.println("car1汽油量是"+car1.gas);
		
		System.out.println("car2車號是"+car2.num);
		System.out.println("car2汽油量是"+car2.gas);
	}
}
class Car1
{
	int num;
	double gas;
}
