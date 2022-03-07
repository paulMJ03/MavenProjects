package org.smpl;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.help.HelperClass;

public class Sample1 extends HelperClass {

	public static void main(String[] args) throws IOException {
		launchBrowser();
		loadUrl("https://www.facebook.com/");
		currentUrl();
		getTitle();
		WebElement user = driver.findElement(By.id("email"));
		toText(user, excelRead(0, 0));
		WebElement pass = driver.findElement(By.id("pass"));
		toText(pass, excelRead(0, 1));
		WebElement login = driver.findElement(By.name("login"));
		btnClick(login);

	}

}
