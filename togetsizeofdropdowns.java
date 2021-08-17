package seleniumprojects1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class togetsizeofdropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		String title1="Leaftaps - TestLeaf Automation Platform";
		String title=driver.getTitle();
		System.out.println(title);
		if(title1.equals(title))
	     {
	    	 System.out.println("In the Home page");
	     }
	     else
	     {
	    	 System.out.println("Not in the page");
	     }
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		String[] options = driver.findElement(By.id("createLeadForm_dataSourceId")).getText().split("\n");
		System.out.println(options.length);
		//Select se= new Select(driver.findElement(By.id("createLeadForm_dataSourceId")));
		//List<WebElement> lst= se.getOptions();
		//System.out.println(lst.size());
		String[] options1=driver.findElement(By.id("createLeadForm_industryEnumId")).getText().split("\n");
		System.out.println("The length of Industrytype is: "+options1.length);
		String[] options2=driver.findElement(By.id("createLeadForm_marketingCampaignId")).getText().split("\n");
		System.out.println("The Length of Marketing compaign dropdown is: "+options2.length);
	    String[] options3=driver.findElement(By.id("createLeadForm_ownershipEnumId")).getText().split("\n");
	    System.out.println("Length of ownership dropdwon is: "+options3.length);
	    String[] options4=driver.findElement(By.id("createLeadForm_currencyUomId")).getText().split("\n");
		System.out.println("The size of the currency dropdown is: "+options4.length);
	    		
	    		String[] options5=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).getText().split("\n");
	    		System.out.println("The size of the state dropdown is: "+options5.length);
		
	String[] options6=driver.findElement(By.id("createLeadForm_generalCountryGeoId")).getText().split("\n");
	System.out.println("The size of the Country drpdown is:"+options6.length);
	}

}
