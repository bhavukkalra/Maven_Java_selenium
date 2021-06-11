package ui;

import java.util.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.sun.tools.javac.util.List;

import org.openqa.selenium.WebElement;

public class DemoAutomation {

	public static void main(String[] args) throws InterruptedException {
		
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://intense-brushlands-19891.herokuapp.com/");
		driver.manage().window().maximize();
		
		
		List<String> emails = Arrays.asList("temp123@gmail.com", "bhavuk@bhavuk.com", "paritoshsharma@gmail.com", "mohit1@gmai.com");
		List<String> passwords = Arrays.asList( "123","temp1234" ,"fasdfsdaf", "123456");
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/header/ul/li[2]/a")).click();
		
		
	
		
		Actions action = new Actions(driver);
		
		for(int i = 0; i< emails.size(); i++) {
			System.out.println(emails.get(i));
			System.out.println(driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/header/ul/li[3]/a")).getAttribute("innerHTML"));
			driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);			
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			
//			driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/form/div[1]/input")).clear();
			
			
//			1until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/form/div[2]/input")))).clear();
			
			
			try {
				Thread.sleep(3000);
				
			}
			catch(Exception e) {
				System.out.println(e);
			}
			
			
			
			
//			driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/form/div[2]/input")).click();
			
//		
			driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/form/div[1]/input")).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
			
			try {
				Thread.sleep(3000);
				
			}
			catch(Exception e) {
				System.out.println(e);
			}
			
			
			driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/form/div[2]/input")).sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
//			driver.findElement(By.cssSelector("input[type=password]")).clear();
			
			
			driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/form/div[1]/input")).sendKeys(emails.get(i));
			
			driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/form/div[2]/input")).sendKeys(passwords.get(i));
			driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/form/button")).click();
			
			int length = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/form/div[2]/input")).getText().length();
			
			for(int j = 0; j < length; j++) {
				action.sendKeys(Keys.ARROW_LEFT);
			}
			
			action.build().perform();
			
			for(int k = 0 ; k < length; k++) {
				action.sendKeys(Keys.DELETE);
			}
			
			Thread.sleep(1000);
			
			
//			
		}
		
		
		
		
		
		
//		System.out.println("HEloo");
		
		
		
		
		
		
		
////		if(driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/header/ul/li[3]/a")).getAttribute("innerHTML").equals("login")) {
			

			
//			driver.findElements(By.className("login")).get(0).sendKeys("bhavuk@bhavuk.com");
			
//			System.out.println(driver.findElements(By.className("input")));
			
//			
////		}
////			driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
////			driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/header/ul/li[2]/a")).click();
////			driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
////			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//			
//			System.out.println(driver.findElementsByTagName("input").get(1).getAttribute("Placeholder"));
//
//			
////			System.out.println(driver.findElementByTagName("form").findElement(By.id("method")));
//			
////			driver.findElement(By.id("submit_get"));
////			driver.findElement(By.id("response")).sendKeys("GET");
////			System.out.println(driver.findElement(By.cssSelector("method")));
//			
////			driver.findElement(By.cssSelector("#method input"));
//			
////			driver.findElementByCssSelector("#method input");
//			
////			driver.findElementById("method");
			
//			driver.findElement(By.xpath("/html/body/div/div/div/div/form/input[3]"));
			
			
//			driver.findElements(By.tagName("input")).get(1).sendKeys("array1");
//			System.out.println(driver.findElements(By.tagName("input")).get(2).getAttribute("placeholder"));

//			System.out.println(driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/form/input[2]")).getAttribute("placeholder"));
//			driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/form/input[2]")).click();
			//*[@id="__layout"]/div/div/form/input[3]
//		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/header/ul/li[2]/a")).click();
		
	
	}

}
