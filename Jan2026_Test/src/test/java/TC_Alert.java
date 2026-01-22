import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		webdrivermanager.c
		 WebDriverManager.edgedriver().setup();
   	  WebDriver driver = new EdgeDriver();
   	  driver.get("https://letcode.in/alert");
   	  driver.findElement(By.id("accept")).click();
   	  Alert simplealert = driver.switchTo().alert();
   	  System.out.println("simple alert "+simplealert.getText());
   	  simplealert.accept();
  
	}

}
