package driver.com;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		//webdriver
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Windows.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[contains(text(),'click')][1]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		String parentwindow = driver.getWindowHandle();
		
		Set<String> winodws = driver.getWindowHandles();
		
		int sizseofwin = winodws.size();
		System.out.println(sizseofwin);
		int i=0;
		for(String win :winodws) {
			i++;
			if(i==2) {
			driver.switchTo().window(win);
			}
		}
		
		
		driver.findElement(By.xpath("//a[contains(text(),'GoDaddy.com')]")).click();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.close();
		
		driver.switchTo().window(parentwindow);
		
		driver.findElement(By.xpath("//button[contains(text(),'click')][1]")).click();
		driver.quit();
		
	}

}
