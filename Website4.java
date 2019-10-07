import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Website4 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\u721223\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com");
		
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Demos")).click();
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[1]/a"));
		ele.click();
		driver.findElement(By.linkText("Droppable")).click();
		
		driver.findElement(By.cssSelector("a[href='https://jqueryui.com/resizable/']")).click();
		
		//driver.findElement(By.tagName("Selectable"));
		
		WebElement ele3 = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[5]/a"));
		ele3.click();
	
	}

	}

