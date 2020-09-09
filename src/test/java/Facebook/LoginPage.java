package Facebook;

import java.io.IOException;

import org.testng.annotations.Test;

public class LoginPage extends Base{
	
	
	@Test
	public void HomePage() throws IOException
	{
	driver=intializeDriver();
	driver.get("https://www.facebook.com/");
	}
	
	

}
