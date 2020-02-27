import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home2 {

    public static void main(String[] args) {

       System.setProperty("webdriver.chrome.driver","/Users/mdahsanzahid/IdeaProjects/io.1st_Automation_Test/Driver/chromedriver 3");

        WebDriver driver = new ChromeDriver();

        driver.get("https://stackskills.com/");

       // driver.findElement(By.className("navbar-link fedora-navbar-link")).click();

       // driver.findElement(By.className("fedora-navbar-link navbar-link")).click();

        driver.findElement(By.xpath("//*[@id=\"navbar\"]/div/div/div/ul/li[6]/a")).click();


    }
}

