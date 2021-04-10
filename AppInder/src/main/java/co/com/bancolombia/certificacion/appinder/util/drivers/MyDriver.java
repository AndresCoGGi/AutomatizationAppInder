package co.com.bancolombia.certificacion.appinder.util.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MyDriver {

  private static WebDriver driver;

  public static MyDriver web() {
    System.setProperty("webdriver.chrome.driver",
        "chromedriver.exe");
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--incognito", "--start-maximized", "--disable-infobars");
    driver = new ChromeDriver(options);
    return new MyDriver();
  }

  public WebDriver inThePage(String url) {
    driver.get(url);
    return driver;
  }

}
