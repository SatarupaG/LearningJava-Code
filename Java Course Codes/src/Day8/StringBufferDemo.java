package Day8;

public class StringBufferDemo 
{
	public static void main(String[] args)
	{
		StringBuffer bf=new StringBuffer("My name is Subrajeet Mohanty. ");
		System.out.println(bf.append("And I am not a Terrorist."));
		System.out.println(bf.delete(10, 28));
		System.out.println(bf.replace(10, 38, " Subrajeet Mohanty."));
		System.out.println(bf.reverse());
	}
}