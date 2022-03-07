package greens.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.help.HelperClass;

public class Greens extends HelperClass {

	public static void main(String[] args) {
		
		launchBrowser();
		loadUrl("http://www.greenstechnologys.com/");
		WebElement element1 = driver.findElement(By.xpath("//*[@src='images/greenstechnologys_logo.png']"));
		WebElement element2 = driver.findElement(By.xpath("//*[contains(text(),'All Rights Reserved.')]"));
		toScroll(element1, element2);
		printText(element2);
		WebElement element3 = driver.findElement(By.xpath("//*[text()='No 1 Software Training Institutes in Chennai with Placements']"));
		toScroll(element2, element3);
		printText(element3);
		
		
		
		

	}

}
