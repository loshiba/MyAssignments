package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathFacebook {

			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				
				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.get("http://www.facebook.com/");
				
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys("loshiba5139@gmail.com");
				driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("");
				driver.findElement(By.xpath("//button[contains(@data-testid,'royal')]")).click();
				Thread.sleep(3000);
				String title = driver.getTitle();
				
				if(title.contains("Facebook")) {
					System.out.println("login is successful");
				}else {
					System.out.println("login is not successful");
				}
				Thread.sleep(3000);
				driver.close();
			}



	}


