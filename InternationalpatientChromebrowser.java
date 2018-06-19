package cloudwaysapp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class InternationalpatientChromebrowser {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/home/avohi/Downloads/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
			driver.get("http://wordpress-129175-517270.cloudwaysapps.com/");
	
			Thread.sleep(3000);
			WebElement services=driver.findElement(By.linkText("International Patient Services"));
			services.click();
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,250)");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,400)");
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,750)");
			Thread.sleep(2000);
			
			js.executeScript("window.scrollBy(0,-1000)");
			Thread.sleep(2000);
			driver.findElement(By.id("accommodation")).click();
			
			Thread.sleep(5000);
			
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollBy(0,250)");
			Thread.sleep(2000);
			js1.executeScript("window.scrollBy(0,400)");
			Thread.sleep(2000);
			js1.executeScript("window.scrollBy(0,250)");
			Thread.sleep(2000);
			
			js1.executeScript("window.scrollBy(0,500)");
			Thread.sleep(2000);
			
			js1.executeScript("window.scrollBy(0,-1000)");
			Thread.sleep(2000);
		
	WebElement paymentmode=driver.findElement(By.id("paymentmode"));
	paymentmode.click();
	JavascriptExecutor js11 = (JavascriptExecutor) driver;
	js11.executeScript("window.scrollBy(0,250)");
	Thread.sleep(2000);
	js11.executeScript("window.scrollBy(0,400)");
	Thread.sleep(2000);
	js11.executeScript("window.scrollBy(0,250)");
	Thread.sleep(2000);

	js11.executeScript("window.scrollBy(0,500)");
	Thread.sleep(2000);


	js11.executeScript("window.scrollBy(0,-1000)");
	Thread.sleep(2000);

	WebElement ourbankdetails=driver.findElement(By.id("ourbankdetails"));
	ourbankdetails.click();
	Thread.sleep(2000);

	JavascriptExecutor js2 = (JavascriptExecutor) driver;
	js2.executeScript("window.scrollBy(0,250)");
	Thread.sleep(2000);
	js2.executeScript("window.scrollBy(0,400)");
	Thread.sleep(2000);
	js2.executeScript("window.scrollBy(0,250)");
	Thread.sleep(2000);
	js2.executeScript("window.scrollBy(0,500)");
	Thread.sleep(2000);
	js2.executeScript("window.scrollBy(0,-1000)");
	Thread.sleep(2000);
	WebElement interpreterservice=driver.findElement(By.id("interpreterservices"));
	interpreterservice.click();
		
	JavascriptExecutor js3 = (JavascriptExecutor) driver;
	js3.executeScript("window.scrollBy(0,250)");
	Thread.sleep(2000);
	js3.executeScript("window.scrollBy(0,400)");
	Thread.sleep(2000);
	js3.executeScript("window.scrollBy(0,250)");
	Thread.sleep(2000);
	js3.executeScript("window.scrollBy(0,500)");
	Thread.sleep(2000);	
	js3.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(2000);	
	js3.executeScript("window.scrollBy(0,-1000)");
	Thread.sleep(2000);	
	WebElement splservice=driver.findElement(By.id("specialservices"));
	splservice.click();


	JavascriptExecutor js4 = (JavascriptExecutor) driver;
	js4.executeScript("window.scrollBy(0,250)");
	Thread.sleep(2000);
	js4.executeScript("window.scrollBy(0,400)");
	Thread.sleep(2000);
	js4.executeScript("window.scrollBy(0,250)");
	Thread.sleep(2000);
	js4.executeScript("window.scrollBy(0,500)");
	Thread.sleep(2000);	
	js4.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(2000);	
	js4.executeScript("window.scrollBy(0,-1000)");
	Thread.sleep(2000);	
	
	WebElement videoconsultation=driver.findElement(By.id("videoconsultationservices"));
	videoconsultation.click();
		
	JavascriptExecutor js5 = (JavascriptExecutor) driver;
	js5.executeScript("window.scrollBy(0,250)");
	Thread.sleep(2000);
	js5.executeScript("window.scrollBy(0,400)");
	Thread.sleep(2000);
	js5.executeScript("window.scrollBy(0,250)");
	Thread.sleep(2000);
	js5.executeScript("window.scrollBy(0,500)");
	Thread.sleep(2000);
	
	js5.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(2000);	
	js5.executeScript("window.scrollBy(0,-1000)");
	Thread.sleep(2000);	
	
	WebElement faq=driver.findElement(By.id("faq"));
	faq.click();
		
	JavascriptExecutor js6 = (JavascriptExecutor) driver;
	js6.executeScript("window.scrollBy(0,250)");
	Thread.sleep(2000);
	js6.executeScript("window.scrollBy(0,400)");
	Thread.sleep(2000);
	js6.executeScript("window.scrollBy(0,250)");
	Thread.sleep(2000);
	js6.executeScript("window.scrollBy(0,500)");
	Thread.sleep(2000);		
			
	
	}

}
