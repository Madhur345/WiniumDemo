package com.winium.demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.Test;

public class CalculatorTest {
	
	@Test
	public void calculator() throws MalformedURLException, InterruptedException {

		DesktopOptions option = new DesktopOptions();
		 
		option.setApplicationPath("C:\\Windows\\System32\\calc.exe");
		 
		WiniumDriver driver = new WiniumDriver(new URL("http://localhost:9999"), option);
		 
		Thread.sleep(5000);
		
		 
		driver.findElement(By.name("Seven")).click();
		 
		driver.findElement(By.name("Plus")).click();
		 
		driver.findElement(By.name("Eight")).click();
		 
		driver.findElement(By.name("Equals")).click();
		 
		Thread.sleep(5000);
		 
		String output = driver.findElement(By.id("CalculatorResults")).getAttribute("Name");
		 
		System.out.println("Result after addition is: "+output);
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("Close")).click();
		 
	}

}
