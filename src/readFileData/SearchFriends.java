package readFileData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchFriends {

	

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
				Thread.sleep(2000);
				
				dv.findElement(By.xpath(prop.getProperty("Search"))).sendKeys(prop.getProperty("SearchName"));
				Thread.sleep(500);

	}

}
