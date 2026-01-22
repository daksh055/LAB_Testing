package seleniumpac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Findelement {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver dr =new ChromeDriver();
		dr.get("https://amazon.in");
		Thread.sleep(1000);
		List <WebElement> links = dr.findElements(By.tagName("a"));
//		List<WebElement> links=dr.findElements(By.tagName("a"));
		for(WebElement link : links) {
			System.out.println(link.getText());
			
		}
		// TODO Auto-generated method stub

	}

}
