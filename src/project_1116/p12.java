package project_1116;

public class p12 {
	public static void main(String[] args)	
	{
		Car4 car1 = new Car4();
		
		car1.num=1234;
		car1.gas=20.5;
		
		car1.showCar();
	}
}
class Car4
{
	int num;
	double gas;
	
	void show() 
	{
	System.out.println("車號是"+num);
	System.out.println("汽油量是"+gas);
	}
	
	void showCar() 
	{
	System.out.println("開始顯示車子資料");
	this.show();
	}
}