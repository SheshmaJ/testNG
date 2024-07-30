package january17;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class anotation1 {
@BeforeMethod 
	void login()
{
	System.out.println("login into..");
}
@Test
void search()
{
	System.out.println("search here");
}
@Test
	void advsearch()
	{
		System.out.println("adv search here");
	}
@AfterMethod
	void logout()
	{
		System.out.println("looinout");
	
}
}
