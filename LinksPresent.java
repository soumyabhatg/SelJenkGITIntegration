package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriverException;

public class LinksPresent {
	public static void main(String[] args) throws  NullPointerException, InterruptedException {
		try {
			
		
		System.setProperty("webdriver.chrome.driver","/home/avohi/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();

		 driver.manage().window().maximize();

		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		 driver.get("http://www.facebook.com");

		 List<WebElement> links=driver.findElements(By.tagName("a"));
		 System.out.println(links.size());

		 ArrayList<String> hrefs = new ArrayList<String>(); 
		    for (WebElement var : links) {
		        System.out.println(var.getText()); 
		        System.out.println(var.getAttribute("href"));
		        hrefs.add(var.getAttribute("href")); 
		        System.out.println("*************************************");
		    }

		    //Navigating to each link
		    int i=1;
		    for (String href : hrefs) {
		        driver.navigate().to(href);
		        System.out.println((++i)+": navigated to URL with href: "+href);
		        Thread.sleep(3000); 
		        System.out.println("***");
		        List <WebElement> buttons = driver.findElements(By.xpath("//input[@type='submit']"));
		        System.out.println("NUMBER OF BUTTONS="+buttons.size());
		    }
		    }
		    catch (Exception e) {
	            e.printStackTrace();
	        }
	}
}
