package proyecto_travelocity.PageObjects;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.pages.PageObject;

public class Travelocity_BuscarAutos_PageObjects extends PageObject {
	
	Travelocity_BuscarHotel_PageObjects travelocity_BuscarHotel_PageObjects;
	
	String mes = "April 2021";
	String dia = "10";
	String numAdultos = "4";
	String numNinos = "2";
	String horaEntrega = "02:45";
	String horaDevolucion = "04:30";
	String arrendadora = "Dollar Rent A Car";
	String descuento = "Corporate or contracted";
	String codigoDescuento = "12345";
	
	
	public void lanzarNavegador() {
		travelocity_BuscarHotel_PageObjects.lanzarNavegador();
	}

	public void validaElemento() {
		travelocity_BuscarHotel_PageObjects.validaElemento();
	}

	public void opcionAutos() {
		try {
			((JavascriptExecutor)getDriver()).executeScript("scroll(0,-2000)");
			WebElement hrefHotel;
			hrefHotel = getDriver().findElement(By.xpath("//*[@id=\"uitk-tabs-button-container\"]/li[3]/a"));
			hrefHotel.click();
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void ClickDestino() {
		try {
			WebElement btnDestino;
			btnDestino = getDriver().findElement(By.xpath("//*[@id=\"location-field-locn-menu\"]/div[1]/button"));
			btnDestino.click();
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	public void IngresaDestino(String destino) {
		try {
			WebElement txtDestino;
			txtDestino = getDriver().findElement(By.id("location-field-locn"));
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
			btnresultado = getDriver().findElement(By.xpath("//*[@id=\"location-field-locn-menu\"]/div[2]/ul/li[1]/button"));
			btnresultado.click();
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	

	public void IngresaDestino2(String destino2) {
		try {
			WebElement txtDestino;
			txtDestino = getDriver().findElement(By.id("location-field-loc2"));
			txtDestino.click();
			txtDestino.sendKeys(destino2);
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
				String text = getDriver().findElement(By.xpath("//*[@id=\"Rental-cars-transportation\"]/div[2]/div[1]/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/h2")).getText();
				Thread.sleep(3000);
				if (text.equals(mes)) {
					break;
				}
				else {
					
					getDriver().findElement(By.xpath("//*[@id=\"Rental-cars-transportation\"]/div[2]/div[1]/div/div/div[1]/div/div[2]/div/div[2]/div[1]/button[2]")).click();
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
			btn_listo = getDriver().findElement(By.xpath("//*[@id=\"Rental-cars-transportation\"]/div[2]/div[1]/div/div/div[1]/div/div[2]/div/div[3]/button"));
			btn_listo.click();
			Thread.sleep(3000);
			
		} catch (Exception e) {
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
			
			getDriver().findElement(By.xpath("//*[@id=\"app-layer-base\"]/div/div[1]/div[1]/div/div/form/div/fieldset[2]/button")); 
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
		
		public void ClickDestino2() {
			try {
				WebElement btnDestino;
				btnDestino = getDriver().findElement(By.xpath("//*[@id=\"location-field-loc2-menu\"]/div[1]/button"));
				btnDestino.click();
				Thread.sleep(3000);
			} catch (InterruptedException e) {
					e.printStackTrace();
			}
		}

		public void seleccionaDestino2() {
			try {
				WebElement btnresultado;
				btnresultado = getDriver().findElement(By.xpath("//*[@id=\"location-field-loc2-menu\"]/div[2]/ul/li[1]/button"));
				btnresultado.click();
				Thread.sleep(3000);
			} catch (InterruptedException e) {
					e.printStackTrace();
			}
				
		}

		public void listSelectHoraEntrega() {
			try {
				WebElement dropdowm = getDriver().findElement(By.xpath("//*[@id=\"Rental-cars-transportation\"]/div[2]/div[2]/div/select"));
				//dropdowm.click();
				Select list = new Select(dropdowm);
				list.selectByVisibleText(horaEntrega);
				Thread.sleep(3000);
			} catch (InterruptedException e) {
					
					e.printStackTrace();
				}	
		}

		public void listSelectHoraDevolucion() {
			try {
				WebElement dropdowm = getDriver().findElement(By.xpath("//*[@id=\"Rental-cars-transportation\"]/div[2]/div[3]/div/select"));
				//dropdowm.click();
				Select list = new Select(dropdowm);
				list.selectByVisibleText(horaDevolucion);
				Thread.sleep(3000);
			} catch (InterruptedException e) {
					
					e.printStackTrace();
				}	
		}

		public void incluirTarifas() {
			try {
				WebElement cbAuto;
				cbAuto = getDriver().findElement(By.id("aarp-checkbox-toggle"));
				cbAuto.click();
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}

		public void codigoDescuento() {
			try {
				WebElement cbAuto;
				cbAuto = getDriver().findElement(By.xpath("//*[@id=\"Rental-cars-transportation\"]/details/summary/span[2]"));
				cbAuto.click();
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}

		public void Arrendadora() {
			try {
				WebElement select = getDriver().findElement(By.xpath("//*[@id=\"Rental-cars-transportation\"]/details/div/div/div[1]/div/select"));
				Select dropDown = new Select(select);      
				
				List<WebElement> Options = dropDown.getOptions();
				for(WebElement option:Options){
				    if(option.getText().equals(arrendadora)) {
				      option.click(); //select option here;       
				    }               
				}
				Thread.sleep(3000);
			} catch (InterruptedException e) {
					
					e.printStackTrace();
				}	
		}

		public void TipoDescuento() {
			try {
				WebElement select = getDriver().findElement(By.xpath("//*[@id=\"Rental-cars-transportation\"]/details/div/div/div[2]/div/select"));
				Select dropDown = new Select(select);      
				
				List<WebElement> Options = dropDown.getOptions();
				for(WebElement option:Options){
				    if(option.getText().equals(descuento)) {
				      option.click(); //select option here;       
				    }               
				}
				Thread.sleep(3000);
			} catch (InterruptedException e) {
					
					e.printStackTrace();
				}	
			
		}

		public void IngresarCodigoDescuento() {
			try {
				WebElement txtDestino;
				txtDestino = getDriver().findElement(By.id("coupon-code-0"));
				txtDestino.click();
				txtDestino.sendKeys(codigoDescuento);
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}


	
}
