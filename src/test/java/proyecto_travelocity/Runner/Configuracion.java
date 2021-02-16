package proyecto_travelocity.Runner;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;

public class Configuracion extends PageObject {
	
	
	public void DriverChrome() {
		WebDriver driver = new ChromeDriver(); 
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/Driver/chromedriver.exe");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.travelocity.com/");
		System.out.println(driver.getTitle());
	}

	public void posicion_pestana_siguiente() {
		String originalWindow = getDriver().getWindowHandle();

		for (String windowHandle : getDriver().getWindowHandles()) {
		    if(!originalWindow.contentEquals(windowHandle)) {
		        getDriver().switchTo().window(windowHandle);
		        break;
		    }
		}
	}
	
	public void pestanaSiguiente() {
		Serenity.getWebdriverManager().getCurrentDriver().getWindowHandle();
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
	    Set<String> handles = Serenity.getWebdriverManager().getCurrentDriver().getWindowHandles();
	    Iterator<String> iterator = handles.iterator();

	    	while (iterator.hasNext()){
	    		iterator.next();
	    }
	    	Serenity.getWebdriverManager().getCurrentDriver().switchTo().window(parentWindowsHandler);
		}
	}

