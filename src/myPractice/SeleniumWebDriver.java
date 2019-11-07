package myPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class SeleniumWebDriver {

	public static void main(String[] args) {
		{
			//ProfilesIni in=new ProfilesIni();
			WebDriver dr=new FirefoxDriver();
			String Url="https://www.naukri.com";
			dr.get(Url);
			dr.manage().window().maximize();
			dr.findElement(By.id("login_Layer")).click();
			dr.findElement(By.id("eLoginNew")).sendKeys("praveenvarma125@gmail.com");
			dr.findElement(By.id("pLogin")).sendKeys("Varma@1250");
			//dr.findElement(By.tagName("button")).click();
			dr.findElement(By.xpath("//div[@class='row']//button[@value='Login']")).click();
			dr.findElement(By.xpath("//div[@id='b1']//form[@id='skip']//button[@type='submit']")).click();
			//dr.quit();
			//dr.findElement(By.className("blueBtn")).click();
			
			
		
			//dr.quit();
			
		}
	}
}
