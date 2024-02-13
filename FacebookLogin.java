package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("loshiba5139@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("");
		driver.findElement(By.name("login")).click();
			
		//ctrl+2-l
		String title = driver.getTitle();
		//System.out.println(title);
		
		//contains will partial match
		if(title.contains("Facebook")) {
			System.out.println("login is successful");
		}else {
			System.out.println("login is not successful");
		}
		Thread.sleep(3000);
		driver.close();
	}

}
