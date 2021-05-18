package Calculator.Application;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;
import org.testng.Assert;

	

public class AdditionTestCase 
{
	Calculator Obj=new Calculator();
	
	@BeforeGroups("RegressionTesting")
	public void Init1()
	{
		System.out.println("Before groups");
		Obj = new Calculator();
		
	}
	
	@BeforeClass
	public void Init()
	{
		System.out.println("Before ");
		Obj = new Calculator();
		
	}
	@Test(priority = 2,groups= {"RegressionTesting"})
	
	public void TestAdditionWithPositiveNumbers() {
		
		int Result=Obj.Addition(10,20);
		Assert.assertEquals(Result, 30,"Addition does not work with positive numbers");
	}
}