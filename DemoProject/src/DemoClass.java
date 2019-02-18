import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hellow world");

		
		System.setProperty("webdriver.chrome.driver", "D:\\Devops\\Setup\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.guru99.com/first-webdriver-script.html");
	}

}
