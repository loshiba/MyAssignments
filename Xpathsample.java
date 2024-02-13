package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Xpathsample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leaftaps.com/opentaps/control/login");
		
		//attibute based xpath
		WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
		user.sendKeys("DemoSalesManager");	
		//Thread.sleep(2000);
		
		WebElement user1=driver.findElement(By.xpath("//input[@id='password']"));
		user1.sendKeys("crmsfa");
		//Thread.sleep(2000);
		
		//partial attribute based xpath
		driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		
		if(title.contains("TestLeaf")) {
			System.out.println("login is successful");
		}else {
			System.out.println("login is not successful");
	}
}
}


