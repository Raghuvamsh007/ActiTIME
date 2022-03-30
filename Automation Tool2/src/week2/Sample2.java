package week2;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample2 {//TEST SCRIPT 22

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E:\\QSPIDERS\\geckodriver/geckodriver.exe");
		FirefoxDriver ff= new FirefoxDriver();//open browser
		ff.get("file:///C:/New%20folder/Desktop/Handling%20bulk%20elements/Bulkelements.html");//enter url
		ff.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//synchronization
		List<WebElement> rv1 = ff.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0; i<rv1.size();i++)
		{
			rv1.get(i).click();
		}
		

	}

}
