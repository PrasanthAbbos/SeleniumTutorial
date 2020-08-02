package driver.com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		//webdriver
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/WebTable.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		/*	WebElement select =  driver.findElement(By.id("Skills"));
		
		 http://demo.automationtesting.in/Register.html

		Select sel =  new Select(select);

		sel.selectByVisibleText("Adobe Photoshop");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement country = driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']"));

		country.sendKeys("Hong Kong");

		Actions act = new Actions(driver);

		act.sendKeys(Keys.ENTER).build().perform();*/

		WebElement table = driver.findElement(By.xpath("//div[@class='ui-grid-viewport ng-isolate-scope']"));

		List<WebElement> row = driver.findElements(By.xpath("//div[@class='ui-grid-viewport ng-isolate-scope']/div/div"));

		int si = row.size();

		System.out.println(si);

		List<WebElement> col = driver.findElements(By.xpath("//div[@class='ui-grid-viewport ng-isolate-scope']/div/div[1]/div/div"));
		//List<WebElement> col = row.get(0).findElements(By.xpath("/div/div"));

		int siz = col.size();

		System.out.println(siz);
		int count =0;

		for(int i = 1;i<=si;i++) {
			
			String sx = driver.findElement(By.xpath("//div[@class='ui-grid-viewport ng-isolate-scope']/div/div["+i+"]/div/div[3]/div")).getText();
		
		if(sx.equalsIgnoreCase("Male")) {
			count++;
		}
		}

		System.out.println(count);


driver.quit();









	}

}
