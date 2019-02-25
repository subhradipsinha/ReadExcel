package readFileData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;


public class ReadFileData {

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
	
		
		
			System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
			WebDriver dv = new FirefoxDriver();
			dv.get(prop.getProperty("URL")); 
			dv.manage().window().maximize();// Window open maximize size always open
			Thread.sleep(5000);
			
			dv.findElement(By.xpath(prop.getProperty("Register"))).click();
			Thread.sleep(1000);
			dv.findElement(By.xpath(prop.getProperty("FirstName"))).sendKeys(prop.getProperty("username"));
			Thread.sleep(1000);
			dv.findElement(By.xpath(prop.getProperty("Lastname"))).sendKeys(prop.getProperty("lastname"));
			Thread.sleep(500);
			dv.findElement(By.xpath(prop.getProperty("EmailAddress"))).sendKeys(prop.getProperty("emailaddress"));
			Thread.sleep(500);
			//dv.findElement(By.xpath(prop.getProperty("RetypeEmailAddress"))).sendKeys(prop.getProperty("retypeemailaddress"));
			//Thread.sleep(500);
			dv.findElement(By.xpath(prop.getProperty("Password"))).sendKeys(prop.getProperty("password"));
			Thread.sleep(500);
			
			dv.findElement(By.xpath(prop.getProperty("ConfirmPassword"))).sendKeys(prop.getProperty("confirmpassword"));
			Thread.sleep(500);
			
			dv.findElement(By.xpath(prop.getProperty("PhoneNumber"))).sendKeys(prop.getProperty("phonenumber"));
			Thread.sleep(500);
			
			/*Select sel =new Select(dv.findElement(By.id("day")));
			sel.selectByIndex(07);
			
			Select sel2 = new Select(dv.findElement(By.id("month")));
			sel2.selectByVisibleText("Sept");
			
			Select sel3 = new Select(dv.findElement(By.xpath(prop.getProperty("Year"))));
			sel3.selectByValue(prop.getProperty("year"));
			
			dv.findElement(By.xpath(prop.getProperty("Gender"))).click();
			Thread.sleep(500);*/
			
			dv.findElement(By.xpath(prop.getProperty("Submit Button"))).click();
			
			prop.getProperty("URL"); 
			System.out.println("FirstName::" + prop.getProperty("FirstName"));
			System.out.println("Last Name::" + prop.getProperty("Last Name"));
		     System.out.println("Password::" +prop.getProperty("password"));

	}
}