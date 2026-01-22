package seleniumpac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_navigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
//		driver.navigate().to("https://www.flipkart.com");
//		//driver.get();
		
		driver.navigate().to("https://www.amazon.in/");
		System.out.println("Title:"+driver.getTitle());
		
		driver.navigate().back();
		System.out.println("Title after back:"+driver.getTitle());
		
		driver.navigate().forward();
		System.out.println("Title after forward:"+driver.getTitle());

	}

}
