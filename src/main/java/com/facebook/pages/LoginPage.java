package com.facebook.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public void openUrl() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santosh\\Desktop\\Automation Testing\\Selenium\\Software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//button[@title='Allow essential and optional cookies']")).click();
		driver.manage().window().maximize();
	}
	public void userNeme() {
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	}
	public void passWord() {
		driver.findElement(By.id("pass")).sendKeys("1234");
	}
	public void loginButton() {
		driver.findElement(By.name("login")).click();
	}
	public void verifyLogin() {
		System.out.println("Login Successfully");
	}
	public void createAccount() {
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	}
	public void verifySignup() {
		System.out.println("Signup Successfully");
	}
}
