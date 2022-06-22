package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConCatTest {

	@Test
	public void ConCattest()
	{
		//creating a object of class
		MyJunitClass junit=new MyJunitClass();
		String result=junit.ConCat("Package","Junit");
		assertEquals("PackageJunit", result);
	}

}
