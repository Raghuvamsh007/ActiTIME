package week1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class sample12 //TEST SCRIPT 16
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E:\\QSPIDERS\\geckodriver/geckodriver.exe");
		FirefoxDriver rv1= new FirefoxDriver();//open browser
		rv1.get("https://jqueryui.com/resources/demos/droppable/default.html");//enter url
		//locate source address, store it in a web element variable
		WebElement source=rv1.findElement(By.id("draggable"));
		//Locate Target address, store it in a web element variable
		WebElement target=rv1.findElement(By.id("droppable"));
		//Create object of Actions class and pass browser control as argument
		Actions a1=new Actions(rv1);
		//Call dragAndDrop method, pass source and target address
		a1.dragAndDrop(source, target).build().perform();
		
	}

}
