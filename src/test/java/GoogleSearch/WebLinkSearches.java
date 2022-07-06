package GoogleSearch;

import java.util.Collection;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebLinkSearches {
	static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/saied rahman/utilities/chromedriver.exe");
		driver = (WebDriver) new ChromeDriver();
		driver.get("https://www.google.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys(" bangladeshi resturent in atlanta ga");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
		Thread.sleep(1000);
		
		String webTitle = driver.getTitle();
		Collection<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("The number of links is" +links.size());
		
		for (WebElement link:links) {
			System.out.println(link.getText());
			
		}

	}

}
