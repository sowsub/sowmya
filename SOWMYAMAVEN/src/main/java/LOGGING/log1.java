package LOGGING;


import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class log1 {
	
	
	static Logger log= LogManager.getLogger(log1.class);
	
	public static void main(String[] args) throws InterruptedException {

   System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	
	ChromeDriver ob= new ChromeDriver();
	ob.get("https://courses.letskodeit.com/practice");
	log.info("visited website");
	log.info("going to click n checkboxes");
	
	

  List<WebElement> ele= ob.findElementsByXPath("//[@name='cars' and @type ='checkbox']");

	log.warn("check box may not be visible");
	
	
	for(WebElement x:ele)
	
	{
		
	if(x.isDisplayed())
		
	{
	x.click();
	}
	}
	Thread.sleep(3000);
	
	log.info("closing");
	
	ob.quit();
	
	}
	
	
	
	
	
	
	
	
	
	

}
