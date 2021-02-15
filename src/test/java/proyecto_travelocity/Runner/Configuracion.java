package proyecto_travelocity.Runner;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.serenitybdd.core.Serenity;

public class Configuracion {
	
	public void DriverChrome() {
		
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.get("https://www.travelocity.com/");
		driver.navigate().to("https://www.travelocity.com/");
	}
	
	public void pestanaSiguiente() {
		String parentWindowsHandler = Serenity.getWebdriverManager().getCurrentDriver().getWindowHandle();
		String subWindowHandler = null;

		Set<String> handles = Serenity.getWebdriverManager().getCurrentDriver().getWindowHandles();
		Iterator<String> iterator = handles.iterator();

			while (iterator.hasNext()){
				subWindowHandler = iterator.next();
			}
			Serenity.getWebdriverManager().getCurrentDriver().switchTo().window(subWindowHandler);
	}
	
	public void pestanaAnterior() {
		String parentWindowsHandler = Serenity.getWebdriverManager().getCurrentDriver().getWindowHandle();
	    String subWindowHandler = null;

	    Set<String> handles = Serenity.getWebdriverManager().getCurrentDriver().getWindowHandles();
	    Iterator<String> iterator = handles.iterator();

	    	while (iterator.hasNext()){
	    		subWindowHandler = iterator.next();
	    }
	    	Serenity.getWebdriverManager().getCurrentDriver().switchTo().window(parentWindowsHandler);
		}
	}

