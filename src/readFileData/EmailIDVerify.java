package readFileData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class EmailIDVerify {

	
	public static void main(String[] args) throws InterruptedException, IOException {
		File file =new File("./Driver/facebook.properties");
		FileInputStream fileinput = null;
		try{
			fileinput = new FileInputStream(file);
		}
		catch
		(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		Properties prop = new Properties();
		{
			prop.load(fileinput);
		}
	
		
			
			
				System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
				WebDriver dv = new ChromeDriver();
				dv.get(prop.getProperty("URL")); 
				dv.manage().window().maximize();// Window open maximize size always open
				Thread.sleep(2000);
				dv.findElement(By.xpath(prop.getProperty("Close"))).click();
				Thread.sleep(3000);
				WebElement Slider = dv.findElement(By.xpath(prop.getProperty("Picture")));
				Slider.click();
				Thread.sleep(3000);
				
				dv.navigate().back();
				Thread.sleep(3000);
				
				/*dv.navigate().forward();
				Thread.sleep(3000);
				
				dv.navigate().refresh();
				Thread.sleep(3000);
				
				dv.navigate().to("https://www.google.com");
				Thread.sleep(3000);*/
				
				WebElement Slider1 = dv.findElement(By.xpath(prop.getProperty("Picture1")));
				Slider1.click();
				Thread.sleep(3000);
				
				dv.findElement(By.xpath(prop.getProperty("Picture1")));
				Slider1.click();
				Thread.sleep(3000);
		
				dv.findElement(By.xpath(prop.getProperty("ClickPicture"))).click();
				Thread.sleep(3000);
						
				Select droup = new Select(dv.findElement(By.xpath(prop.getProperty("Minimum"))));;
				droup.selectByValue((prop.getProperty("minimum")));
				Thread.sleep(2000);
				dv.findElement(By.xpath(prop.getProperty("BRANDRadioButton"))).click();
				Thread.sleep(2000);
				dv.findElement(By.xpath(prop.getProperty("CUSTOMERRATINGS"))).click();
				Thread.sleep(2000);
				dv.findElement(By.xpath(prop.getProperty("Product"))).click();
				Thread.sleep(2000);
				
				/*for
				(String window: dv.getWindowHandles()){
				dv.switchTo().window(window);
				Thread.sleep(5000);
				
				dv.findElement(By.xpath(prop.getProperty("SINGIN"))).click();
				Thread.sleep(1000);
				
				dv.findElement(By.xpath(prop.getProperty("Email"))).sendKeys(prop.getProperty("email"));
				Thread.sleep(1000);
				
				dv.findElement(By.xpath(prop.getProperty("Pass"))).sendKeys(prop.getProperty("pass"));
				Thread.sleep(2000);
				
				dv.findElement(By.xpath(prop.getProperty("Login"))).click();
				Thread.sleep(5000);
				
				
				dv.findElement(By.xpath(prop.getProperty("Search"))).sendKeys(prop.getProperty("SearchName"));
				Thread.sleep(1000);
				dv.findElement(By.xpath(prop.getProperty("SearchButton"))).click();
				dv.findElement(By.xpath(prop.getProperty("Select"))).click();
				
				/*dv.findElement(By.xpath(prop.getProperty("Notification"))).click();
				Thread.sleep(5000);
				dv.findElement(By.xpath(prop.getProperty("NotificationDetails"))).click();*/
				Thread.sleep(5000);
				
	}

}
