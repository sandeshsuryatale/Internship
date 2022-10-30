package uniacco;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ContactUs {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
			                             	"C:\\Program Files\\Java\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://unicreds.com/contact-us");
		
	    driver.findElement(By.id("fullname")).sendKeys("Sandesh suryatale");
	  
	    driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("sandeshsuryatale@gmail.com");
	   
	    WebElement solutions_dropdown = driver.findElement(By.xpath("//select[@class='p-2 pl-4 pr-4 m-2 mt-2 mb-2 form-control form-control-md']"));
	     Select solutions = new Select(solutions_dropdown);
	     solutions.selectByValue("91");
	 
	     driver.findElement(By.id("phone")).sendKeys("0123456789");
	  
	     driver.findElement(By.id("message")).sendKeys("Happiness is an attitude. We either make ourselves miserable, or happy and strong. The amount of work is the same.");
	   
	     driver.findElement(By.id("contactButton")).click();
	     
	     Alert alert = driver.switchTo().alert();
	     alert.accept();
	}

}
