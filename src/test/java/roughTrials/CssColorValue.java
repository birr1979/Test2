package roughTrials;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class CssColorValue {
   public static void main(String[] args) {
//      System.setProperty("webdriver.chrome.driver",
//      "C:\\Users\\ghs6kor\\Desktop\\Java\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      String url = "https://www.tutorialspoint.com/index.htm";
      driver.get(url);
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      //getting color attribute with getCssValue()
      String colr = driver.findElement(By.xpath("/html/body/div[3]/div/a/button"))
      .getCssValue("color");
      //getting background color attribute with getCssValue()
      String bckgclr = driver.findElement(By.xpath("/html/body/div[3]/div/a/button"))
      .getCssValue("background-color");
      System.out.println(colr);
      System.out.println(bckgclr);
      driver.close();
      System.out.println("little change");
   }
}