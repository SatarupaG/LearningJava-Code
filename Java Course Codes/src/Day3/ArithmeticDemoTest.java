package Day3;

public class ArithmeticDemoTest 
{
	public static void main(String[] args) 
	{
		ArithmeticImpl arth=new ArithmeticImpl();
		System.out.println(arth.subtraction(5, 3));
		System.out.println(arth.subtraction(5, 3, 4));
		System.out.println(arth.subtraction(5.589, 3.918));
		System.out.println(arth.subtraction(5, 3.853));
		System.out.println(arth.subtraction(5.4f, 6.3f, 1.9f));
	}
}
