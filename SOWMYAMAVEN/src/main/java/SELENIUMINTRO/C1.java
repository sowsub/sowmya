package SELENIUMINTRO;

import org.openqa.selenium.chrome.ChromeDriver;

public class C1 {

	public static void main(String[] args) {
		
	//lasspath=>selenium jar=>properties=>libraries=>classpath=>	
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");


ChromeDriver ob=new ChromeDriver();
ob.get("http://www.facebook.com");
		
		
	}
	
}
