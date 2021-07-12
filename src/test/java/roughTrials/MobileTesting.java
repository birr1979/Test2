package roughTrials;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MobileTesting {

	@DataProvider (name="a")
	public Object [][] mobileDevices(){
		List<String> devices= new ArrayList();
		
		return new Object[][] {
			{"iPad Pro"},{"Nexus 5"},{"Pixel 2"}	
//inteleje idea
		};
	}

	@Test (dataProvider="a")
	public void mobileTesting(String device) {
		HashMap<String, String> map= new HashMap<String, String>();
		map.put("deviceName", device);


		ChromeOptions options= new ChromeOptions();
		options.setExperimentalOption("mobileEmulation", map);
		WebDriver driver= new ChromeDriver(options);

		driver.get("https://www.afrocouple.com");
		System.out.println(driver.getTitle());
	}

//birr changed

}
