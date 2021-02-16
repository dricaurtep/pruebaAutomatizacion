package proyecto_travelocity.PageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import net.serenitybdd.core.pages.PageObject;
import proyecto_travelocity.Runner.Configuracion;

public class Travelocity_BuscarHotel_PageObjects extends PageObject{

	Configuracion Configuracion;
	
	String mes = "April 2021";
	String dia = "10";
	String numAdultos = "4";
	String numNinos = "2";
	
	public void lanzarNavegador() {
		
		try {
			getDriver().navigate().to("https://www.travelocity.com/");
			Thread.sleep(3000);
			getDriver().manage().window().maximize();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	private boolean elementoExiste() { 
	try { 
		Thread.sleep(3000);
		((JavascriptExecutor)getDriver()).executeScript("scroll(0,2000)");
		getDriver().findElement(By.xpath("//*[@id=\"app-layer-base\"]/div[1]/div/div[2]/footer/div/div/div/ul[2]/li/p")); 
		Thread.sleep(3000);
	} 
	catch (NoSuchElementException | InterruptedException e) {
		e.printStackTrace();
		return false; 
		} 
	return true; 
	
	}
	
	public void validaElemento() {
		if (elementoExiste() == true) {
			System.out.println("el elemento existe");
		}
		else {
			System.out.println("el elemento no existe");
		}
	}
	
	public void opcionHotel() {
		((JavascriptExecutor)getDriver()).executeScript("scroll(0,-2000)");
		WebElement hrefHotel;
		hrefHotel = getDriver().findElement(By.xpath("//*[@id=\"uitk-tabs-button-container\"]/li[1]/a"));
		hrefHotel.click();
	}

	public void ClickDestino() {
		
		try {
			Thread.sleep(3000);
			WebElement btnDestino;
			btnDestino = getDriver().findElement(By.xpath("//*[@id=\"location-field-destination-menu\"]/div[1]/button"));
			btnDestino.click();
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	public void IngresaDestino(String destino) {
		
		try {
			WebElement txtDestino;
			txtDestino = getDriver().findElement(By.id("location-field-destination"));
			txtDestino.click();
			txtDestino.sendKeys(destino);
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public void seleccionaDestino() {
		try {
			WebElement btnresultado;
			btnresultado = getDriver().findElement(By.xpath("//*[@id=\"location-field-destination-menu\"]/div[2]/ul/li[1]/button"));
			btnresultado.click();
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public void agregarVuelo() {
		try {
			WebElement cbAgregarVuelo;
			cbAgregarVuelo = getDriver().findElement(By.xpath("//*[@id=\"add-flight-switch\"]"));
			cbAgregarVuelo.click();
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	public void nuevoOrigen() {
		try {
			WebElement txtnewOrigen;
			txtnewOrigen = getDriver().findElement(By.xpath("//*[@id=\"location-field-origin-menu\"]/div[1]/button"));
			txtnewOrigen.click();
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	public void ingresaOrigen(String origen) {
		try {
			WebElement txtingresaOrigen;
			txtingresaOrigen = getDriver().findElement(By.xpath("//*[@id=\"location-field-origin\"]"));
			txtingresaOrigen.click();
			txtingresaOrigen.sendKeys(origen);
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	public void seleccionaOrigen() {
		try {
			WebElement btntOrigen;
			btntOrigen = getDriver().findElement(By.xpath("//*[@id=\"location-field-origin-menu\"]/div[2]/ul/li[1]/button"));
			btntOrigen.click();
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	public void agregaAuto() {
		try {
			WebElement cbAuto;
			cbAuto = getDriver().findElement(By.id("add-car-switch"));
			cbAuto.click();
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public void clickCalendario() {
		try {
			WebElement btnCalendario;
			btnCalendario = getDriver().findElement(By.xpath("//*[@id=\"d1-btn\"]"));
			btnCalendario.click();
			Thread.sleep(3000);
			
			while(true) {
				String text = getDriver().findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/h2")).getText();
				Thread.sleep(3000);
				if (text.equals(mes)) {
					break;
				}
				else {
					
					getDriver().findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div[1]/button[2]")).click();
				}
			}
			Thread.sleep(3000);
			getDriver().findElement(By.xpath("(//tbody)[1]//tr//td/button[@data-day = "+ dia +"]")).click();
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void btn_listo() {
		try {
			WebElement btn_listo;
			btn_listo = getDriver().findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[1]/div[2]/div/div/div[1]/div/div[2]/div/div[3]/button"));
			btn_listo.click();
			Thread.sleep(3000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void btn_personas() {
		try {
			WebElement btn_personas;
			btn_personas = getDriver().findElement(By.xpath("//*[@id=\"adaptive-menu\"]/div[1]/button"));
			btn_personas.click();
			Thread.sleep(3000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void selec_personas() {
		try {
			WebElement btn_adultos;
			btn_adultos = getDriver().findElement(By.xpath("//*[@id=\"adaptive-menu\"]/div[1]/button"));
			btn_adultos.click();
			Thread.sleep(3000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void agrega_adultos() {
		try {
			while(true) {
				String text = getDriver().findElement(By.xpath("//*[@id=\"adult-input-0\"]")).getAttribute("value");
				Thread.sleep(3000);
					if (text.equals(numAdultos)) {
						break;
					}
					else {
						 WebElement next =   getDriver().findElement(By.cssSelector("#adaptive-menu > div.uitk-menu-container.uitk-menu-open.uitk-menu-pos-right.uitk-menu-container-autoposition.uitk-menu-container-text-nowrap > div > section > div.roomPickerRoom > div.uitk-flex.uitk-flex-align-items-center.uitk-flex-justify-content-space-between.uitk-step-input.adultStepInput.uitk-step-input-mounted > div > button:nth-child(3) > svg"));
						 next.click(); 
						}
					}
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void agrega_ninos() {
		try {
			while(true) {
				String text = getDriver().findElement(By.xpath("//*[@id=\"child-input-0\"]")).getAttribute("value");
				Thread.sleep(3000);
					if (text.equals(numNinos)) {
						break;
					}
					else {
						    getDriver().findElement(By.cssSelector("#adaptive-menu > div.uitk-menu-container.uitk-menu-open.uitk-menu-pos-right.uitk-menu-container-autoposition.uitk-menu-container-text-nowrap > div > section > div.roomPickerRoom > div.uitk-flex.uitk-flex-align-items-center.uitk-flex-justify-content-space-between.uitk-step-input.childStepInput.uitk-step-input-mounted > div > button:nth-child(3) > svg")).click();
						    
						}
					}
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void listSelect() {
			try {
				WebElement dropdowm = getDriver().findElement(By.xpath("//*[@id=\"child-age-input-0-0\"]"));
				//dropdowm.click();
				Select list = new Select(dropdowm);
				list.selectByVisibleText("11");
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	}
	public void agregar_Habitacion() {
		try {
			WebElement agregaHabitacion = getDriver().findElement(By.xpath("//*[@id=\"adaptive-menu\"]/div[2]/div/section/div[2]/button"));
			agregaHabitacion.click();
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public void agregarAdultosHabDos() {
		try {
			while(true) {
				String text = getDriver().findElement(By.xpath("//*[@id=\"adult-input-1\"]")).getAttribute("value");
				Thread.sleep(3000);
					if (text.equals(numAdultos)) {
						break;
					}
					else {
						 WebElement next =   getDriver().findElement(By.cssSelector("#adaptive-menu > div.uitk-menu-container.uitk-menu-open.uitk-menu-pos-right.uitk-menu-container-autoposition.uitk-menu-container-text-nowrap > div > section > div:nth-child(2) > div.uitk-flex.uitk-flex-align-items-center.uitk-flex-justify-content-space-between.uitk-step-input.adultStepInput.uitk-step-input-mounted > div > button:nth-child(3) > svg"));
						 next.click(); 
						}
					}
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void eliminar_habitacion() {
		try {
			WebElement eliminarHabitacion = getDriver().findElement(By.xpath("//*[@id=\"adaptive-menu\"]/div[2]/div/section/div[2]/div[3]/button"));
			eliminarHabitacion.click();
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public void listoHotel() {
		try {
			WebElement listo = getDriver().findElement(By.xpath("//*[@id=\"adaptive-menu\"]/div[2]/div/div[2]/button"));
			listo.click();
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
	
	public void Buscar() {
		try {
			WebElement buscar = getDriver().findElement(By.xpath("//button[contains(text(),'Search')]"));
			buscar.click();
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	private boolean elementoBusquedaExiste() { 
		try { 
			Thread.sleep(3000);
			getDriver().findElement(By.xpath("//*[@id=\"app-layer-base\"]/div/div/div/div[1]/div/section/div/form/div[8]/button")); 
			Thread.sleep(3000);
		} 
		catch (NoSuchElementException | InterruptedException e) {
			e.printStackTrace();
			return false; 
			} 
		return true; 
		
		}
		
		public void validaBusquedaExiste() {
			if (elementoBusquedaExiste() == true) {
				System.out.println("el elemento existe");
			}
			else {
				System.out.println("el elemento no existe");
			}
		}

		public void clickResultado() {
			try {
				WebElement resultado = getDriver().findElement(By.xpath("//*[@id=\"app-layer-base\"]/div/div/div/div[1]/main/div[3]/div/div[2]/section[2]/ol/li[2]/div/div[2]/a"));
				resultado.click();
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}

		private boolean ingresoResultado() { 
			try {
				Thread.sleep(6000);
				Configuracion.posicion_pestana_siguiente();
				((JavascriptExecutor)getDriver()).executeScript("scroll(0,400)");
				getDriver().findElement(By.xpath("//h2[contains(text(),'About this area')]"));
				
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
				return true;
			
			}
			
			public void validaIngresoResultadoExiste() {
				if (ingresoResultado() == true) {
					System.out.println("el elemento existe");
				}
				else {
					System.out.println("el elemento no existe");
				}
			}
		
	
}
