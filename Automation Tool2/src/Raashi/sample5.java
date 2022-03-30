package Raashi;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sample5 {//program for maximize and minimize

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E:\\QSPIDERS\\geckodriver/geckodriver.exe");
		FirefoxDriver rv1= new FirefoxDriver();
		rv1.get("https://www.facebook.com");
		Dimension d1=new Dimension(500,500);
		rv1.manage().window().setSize(d1); //minimize......
		//code for maximize
		rv1.manage().window().maximize(); //maximize.......
		
		
		
	}

}
