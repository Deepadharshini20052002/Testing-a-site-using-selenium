package Tutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("iphone 15 pro max");
		searchbox.submit();
		//driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'][normalize-space()='Apple iPhone 15 Pro Max (256 GB) - Black Titanium'])[1]")).click();
		driver.get("https://www.amazon.in/Apple-iPhone-Pro-Max-256/dp/B0CHWV2WYK/ref=sr_1_1_sspa?crid=10AKIPOSBOJRP&dib=eyJ2IjoiMSJ9.svOoh1rFMRe0APPSfQLQBrIUZQ8AclXIhRcUd14N3YCKCWLSTjUM3lExE-OB0gQr5II55kuPYYl3M_-Pzps57zZwRpbTFd7xtZrXVeERx1Md-eRfEzF2XD3iIrTB2Lqf0jy5FiyjGpNG7Ixpkt3Cm_hlTauY75vFy-Vm2Hs5jG2jbbJieNHM12pfF39LqDU4cwxdGxmE5cycFp8zEWsbLXPmD0bzuX83KpBW8Odu90Q.6GjbY6aIzmuLviVhla58FGCjHGmCiynH9vApfU3frCE&dib_tag=se&keywords=iphone+15+pro+max&qid=1720805886&sprefix=iphone+15+pro+max%2Caps%2C248&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
		driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
	}
}
