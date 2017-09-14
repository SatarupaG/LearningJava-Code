package Day2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArithmaticJUnitTestCase 
{
	@Before
	public void setUp() throws Exception 
{
		@SuppressWarnings("unused")
		int firstNo = 5;
		@SuppressWarnings("unused")
		int secondNo = 6;
	}

	@After
	public void tearDown() throws Exception {}

	@Test
	public void testAddition() 
{
		Arithmetic arithmatic = new Arithmetic();
		int add = 11;
		assertEquals(add, arithmatic.addition(5, 6));
	}

	@Test
	public void testSubtraction() 
{
		Arithmetic arithmatic = new Arithmetic();
		int dif = 1;
		assertEquals(dif, arithmatic.subtraction(6, 5));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testMultiplication() 
{
		Arithmetic arithmatic = new Arithmetic();
		int prod = 30;
		assertEquals(prod, arithmatic.multiplication(6, 5));
	}

	@SuppressWarnings("deprecation")
	@Test
	public void testDivision() 
{
		Arithmetic arithmatic = new Arithmetic();
		int div = 2;
		assertEquals(div, arithmatic.division(8, 4));
	}
}
