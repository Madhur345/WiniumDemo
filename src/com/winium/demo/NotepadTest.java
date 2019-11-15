package com.winium.demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class NotepadTest {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		DesktopOptions option = new DesktopOptions();
		option.setApplicationPath("C:\\Windows\\System32\\notepad.exe");
			WiniumDriver driver=new WiniumDriver(new URL("http://localhost:9999"),option);
			driver.findElement(By.id("15")).sendKeys("This is sample test");
			Thread.sleep(5000);
			String text=driver.findElement(By.id("15")).getText();
			System.out.println(text);
			Thread.sleep(2000);
			driver.findElement(By.name("File")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("Close")).click();
			Thread.sleep(2000);
		}
}
