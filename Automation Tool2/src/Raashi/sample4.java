package Raashi;

import org.openqa.selenium.firefox.FirefoxDriver;

public class sample4 {//program for retrieve source code of current page

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E:\\QSPIDERS\\geckodriver/geckodriver.exe");
		FirefoxDriver rv1= new FirefoxDriver();
		rv1.get("https://www.facebook.com");
		String s=rv1.getPageSource();
		System.out.println(s);
		

	}

}
