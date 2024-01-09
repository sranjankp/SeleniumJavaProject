package maven4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class class9 {
	public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeOptions co= new ChromeOptions();
	co.addArguments("--remote-allow-origins=*");
	WebDriver driver= new ChromeDriver(co);


}}
