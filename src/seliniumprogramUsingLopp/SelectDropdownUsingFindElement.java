package seliniumprogramUsingLopp;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SelectDropdownUsingFindElement {



	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\selinium with java\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/signup");
		List<WebElement> dayvalues = driver.findElements(By.xpath("//*[@id='day']//option"));

		for (WebElement day :dayvalues) 
		{
			String dayvalue = day.getText();
			System.out.println(dayvalue);


			if (dayvalue.equals("20")) {
				day.click();
				break;
			}
		}
		List<WebElement> monthvalues= driver.findElements(By.xpath("//*[@id='month']//option"));

		for (WebElement month :monthvalues) 
		{
			String monthvalue=month.getText();
			System.out.println(monthvalue);
			
			if (monthvalue.equals("June"))
			{
				month.click();
				break;
			}
		}
		List<WebElement> yearvalues =driver.findElements(By.xpath("//*[@title='Year']//option"));

		for(WebElement year :yearvalues) {

			String yearvalue= year.getText();
			System.out.println(yearvalue);
			
			if(yearvalue.equals("1993")) {
				year.click();
			break;
			}
	
		}
	}
}


