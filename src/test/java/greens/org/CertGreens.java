package greens.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.help.HelperClass;

public class CertGreens extends HelperClass {

	public static void main(String[] args) {
		launchBrowser();
		loadUrl("http://www.greenstechnologys.com/");
		WebElement cert = driver.findElement(By.xpath("//*[text()='COURSES']"));
		performMoveToElement(cert);
		WebElement javaTrain = driver.findElement(By.xpath("//*[text()='Java Training']"));
		performMoveToElement(javaTrain);
		WebElement coreJ = driver.findElement(By.xpath("//*[text()='Core Java Training']"));
		btnClick(coreJ);
		implicitWait(8);
		WebElement element1 = driver.findElement(By.xpath("//*[@src='images/greenstechnologys_logo.png']"));
		WebElement element2 = driver.findElement(By.xpath("//*[text()='Java training Reviews from Anitha']"));
		toScroll(element1, element2);
		printText(element2);
		
	}

}
