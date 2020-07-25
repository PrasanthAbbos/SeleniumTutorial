package driver.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriversClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//driver setup
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		//webdriver
		WebDriver driver = new ChromeDriver();

		driver.get("https://phptravels.com/demo");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[@class='btn btn-hero btns btn-success hero-right']")).click();
		
		
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().forward();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.navigate().to("https://phptravels.org/clientarea.phpS");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.quit();
		
		
		/*

		WebElement loginbutton = driver.findElement(By.xpath("//a[@class='btn yx-nfn yx-njg']"));

		if(loginbutton.isDisplayed()) {
			loginbutton.click();
		}else {
			System.out.println("Button not displayed");
		}
*/
	}

}
