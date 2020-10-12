import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create drvier object FirefoxDriver
		
				/* Class name = FirefoxDriver, 
				 * x driver=new x();*/
		
		//getko driver C:\Program Files
		
				System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.salesforce.com/");         // Hit Url on the browser
		System.out.println(driver.getTitle());   // validate if your page title is correct
		
	}

}
