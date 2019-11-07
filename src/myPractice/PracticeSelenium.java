package myPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticeSelenium {
	
	public void Title(WebDriver dr,String ExpectedTitle)
	{
		String ActualTitle=dr.getTitle();
		
		if(ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("Pass");
		}

		else 
			
		{
			System.out.println("Fail");
		}
	}
	
	public static void main(String[] args) {
		
		
		WebDriver dr=new FirefoxDriver();
		dr.manage().window().maximize();
		dr.get("https://www.google.com");
		PracticeSelenium ps=new PracticeSelenium(); 
		System.out.println("Test Case result1: ");
		ps.Title(dr, "Google1");
		
		dr.get("https://www.naukri.com");
		System.out.println("Test Case result2: ");
		ps.Title(dr, "Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com");
		
		dr.navigate().back();
		dr.navigate().forward();
		
		dr.quit();
		
		
		
		
		
	}

}
