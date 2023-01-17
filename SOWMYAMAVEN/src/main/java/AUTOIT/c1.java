package AUTOIT;


import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class c1 {
	
	@Test	
	
	public void filep() throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	
	///classname objectname= new classname();
	
	 ChromeDriver ob= new ChromeDriver();
	 
	 ob.get("https://www.filemail.com/share/upload-file");
	 Thread.sleep(3000);
	 ob.findElementByCssSelector("#addBtn").click();
	 Thread.sleep(3000);
	////Runtime.getRuntime().exec("D:\\Fileupload.exe");
	 
	  

		
	
	
	

}

}
