package week2homeassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class homeass1EditLead {
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub

			ChromeDriver driver=new ChromeDriver();
			//driver.manage().window().maximize();
			driver.get("http://www.leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();
			String title = driver.getTitle();
			System.out.println(title);
			
			//contains will partial match
			if(title.contains("TestLeaf Automation")) {
				System.out.println("login is successful");
			}else {
				System.out.println("login is not successful");
			}
			//attibute based xpath
			WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
			user.sendKeys("DemoSalesManager");	
			WebElement user1=driver.findElement(By.xpath("//input[@id='password']"));
			user1.sendKeys("crmsfa");
			//partial attribute based xpath
			driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
			Thread.sleep(2000);
			
			//driver.findElement(By.xpath("//div[@id='label']")).click();
			//Thread.sleep(1000);
			//text based xpath
			//driver.findElement(By.xpath("//a[text()='Leads']")).click();
			//driver.findElement(By.xpath("//a[text()='Create Lead']")).click(); 
			//Thread.sleep(1000);
			
			driver.findElement(By.partialLinkText("CRM/")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			WebElement cname =driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']"));
			cname.sendKeys("Cognizant Technology Solutions");
			WebElement fname =driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
			fname.sendKeys("Loshiba");
			WebElement lname =driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']"));
			lname.sendKeys("Srinivasan");
			WebElement fnamelo =driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']"));
			fnamelo.sendKeys("losh");
			WebElement dname =driver.findElement(By.xpath("//input[@name='departmentName']"));
			dname.sendKeys("Automation");
			WebElement descr =driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']"));
			descr.sendKeys("Manufacturing/Selenium");
			WebElement email =driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']"));
			email.sendKeys("loshiba19@gmail.com");
			WebElement state=driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
			state.sendKeys("New York");
			Select opt=new Select(state);
			opt.selectByVisibleText("New York");
			driver.findElement(By.xpath("//input[@name='submitButton']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[text()='Edit']")).click();
			WebElement descr1=driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']"));
			//descr1.sendKeys("Manufacturing/Selenium");
			Thread.sleep(1000);
			descr1.clear();
			WebElement imponote =driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']"));
			imponote.sendKeys("Selenium Automation and API testing course");
			driver.findElement(By.xpath("//input[@name='submitButton']")).click();
			String title1 = driver.getTitle();
			System.out.println(title1);
			Thread.sleep(1000);
			driver.close();
		}

}
