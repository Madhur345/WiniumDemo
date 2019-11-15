package com.winium.demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.Test;

public class WordPad {
	
	@Test
	public void wordPad() throws  InterruptedException, MalformedURLException {
		DesktopOptions option = new DesktopOptions();
		option.setApplicationPath("C:\\Program Files (x86)\\Microsoft Office\\root\\Office16\\WINWORD.EXE");
		WiniumDriver driver=new WiniumDriver(new URL("http://localhost:9999"),option);
		Thread.sleep(3000);
		driver.findElement(By.name("Blank document")).click();
		driver.findElement(By.name("Page 1 content")).sendKeys("Hello Vishal");
		driver.findElement(By.name("File Tab")).click();
		driver.findElement(By.name("Save As")).click();
		driver.findElement(By.name("Desktop")).click();
		driver.findElement(By.name("File name:")).sendKeys("Hello10.docx");
		driver.findElement(By.name("Save")).click();
		Thread.sleep(5000);
		driver.close();
	}
}