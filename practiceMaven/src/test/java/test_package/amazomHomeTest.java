package test_package;

import org.testng.Assert;
import org.testng.annotations.Test;

public class amazomHomeTest extends baseClass {

	
	@Test
	public void verifyTheSearchInputField()
	{
		
		String title=home.searchProduct("watches");
		Assert.assertTrue(title.contains("watch"),"test fails for search in product");
		System.out.println("test pass");
		
		
	}
	
	
	
	
}
