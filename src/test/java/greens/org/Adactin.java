package greens.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.help.HelperClass;

public class Adactin extends HelperClass {

	public static void main(String[] args) {
		launchBrowser();
		loadUrl("http://www.adactin.com/HotelApp/");
		WebElement username = driver.findElement(By.id("username"));
		toText(username, "Paul03696");
		WebElement pass = driver.findElement(By.id("password"));
		toText(pass, "password");
		WebElement login = driver.findElement(By.id("login"));
		btnClick(login);
		WebElement loct = driver.findElement(By.id("location"));
		selectByVisibleText("Brisbane", loct);
		WebElement rooms = driver.findElement(By.id("location"));
		selectByValue("3", rooms);
		WebElement sub = driver.findElement(By.id("Submit"));
		btnClick(sub);
		WebElement sel = driver.findElement(By.id("radiobutton_4"));
		btnClick(sel);
		WebElement cont = driver.findElement(By.id("continue"));
		btnClick(cont);
		WebElement frstName = driver.findElement(By.id("first_name"));
		toText(frstName, "paul");
		WebElement lastName = driver.findElement(By.id("last_name"));
		toText(lastName, "vasanth");
		WebElement addrs = driver.findElement(By.id("address"));
		toText(addrs, "chennai");
	}

}
