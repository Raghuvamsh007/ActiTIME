package Raashi;

import org.openqa.selenium.chrome.ChromeDriver;

public class sample ////sample1
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\QSPIDERS\\web drivers/chromedriver.exe");
		ChromeDriver rv1=new ChromeDriver();
		rv1.get("https://www.facebook.com/");
		rv1.navigate().refresh();
		rv1.close();
		
		

	}
}
