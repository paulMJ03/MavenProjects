package org.demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Info {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstname.sendKeys("paul");
		WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastname.sendKeys("vasanth");
		WebElement adress = driver.findElement(By.xpath("//*[@ng-model='Adress']"));
		adress.sendKeys("chrompet");
		WebElement emailid = driver.findElement(By.xpath("//*[@ng-model='EmailAdress']"));
		emailid.sendKeys("paul123@gmail.com");
		WebElement numbr = driver.findElement(By.xpath("//*[@ng-model='Phone']"));
		numbr.sendKeys("9934565678");
		WebElement gendr = driver.findElement(By.xpath("//input[@value='Male']"));
		gendr.click();
		WebElement hobs = driver.findElement(By.xpath("//label[text()=' Cricket ']"));
		hobs.click();
		WebElement hobs1 = driver.findElement(By.xpath("//label[text()='Movies ']"));
		hobs1.click();

	}

}
