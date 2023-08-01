package selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	
		driver.get("https:flipkart.com/");
		//search
		//click enter
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.sendKeys("Iphone"+ Keys.ENTER);
		driver.findElement(By.className("_4rR01T")).click();
		driver.findElement(By.className("_2KpZ6l _2U9uOA ihZ75k _3AWRsL")).click();
		//WebElement regbox= driver.findElement(By.id("txtRegNumber"));
		//regbox.sendKeys("124003079");
		//WebElement passwordbox=driver.findElement(By.id("txtPwd"));
		//passwordbox.sendKeys("deepu295");
		
		
		

	}

}
