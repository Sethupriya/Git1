package Sikuli.demo;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadImageExample {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("imagesrc"))).click();
		driver.findElement(By.xpath("//span[@class='btn btn-success fileinput-button']")).click();
		
		Screen s = new Screen();
		
		Pattern p_filepath = new Pattern("E:\\SPD\\Selenium by pavan\\imageforsikulipgm\\inputsnapshot\\Filepath.PNG");
		Pattern p_openbutton = new Pattern("E:\\SPD\\Selenium by pavan\\imageforsikulipgm\\inputsnapshot\\openbutton.PNG");
		Thread.sleep(5000);
		s.wait(p_filepath, 20);
		s.type(p_filepath,"E:\\SPD\\Selenium by pavan\\imageforsikulipgm\\apple.jpg");
		s.click(p_openbutton);
		
		driver.findElement(By.xpath("//span[normalize-space()='Start']")).click();*/
		
		
driver.get("https://blueimp.github.io/jQuery-File-Upload");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='files]")).click();
		
		String imagesFilepath="E:\\SPD\\Selenium by pavan\\imageforsikulipgm\\inputsnapshot\\";
		String inputFilepath="E:\\SPD\\Selenium by pavan\\imageforsikulipgm\\";
		
		 Screen s = new Screen();
		 
	     Pattern fileInputTextBox = new Pattern(imagesFilepath + "Filepath.PNG");
	     Pattern openButton = new Pattern(imagesFilepath + "openbutton.PNG");
		
		
		
		s.wait(fileInputTextBox, 20);
		s.type(fileInputTextBox,inputFilepath+"apple.jpg");
		s.click(openButton);
	}

}
