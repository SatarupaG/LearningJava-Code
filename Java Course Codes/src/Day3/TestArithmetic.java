package Day3;

public class TestArithmetic 
{
	public static void main(String[] args) 
	{
		Arithmetic arth=new Arithmetic();
		System.out.println(arth.addition(5, 3));
		System.out.println(arth.addition(5, 3, 4));
		System.out.println(arth.addition(5.589, 3.918));
		System.out.println(arth.addition(5, 3.853));
		System.out.println(arth.addition(5.4f, 6.3f, 1.9f));
	}
}
