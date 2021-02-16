package proyecto_travelocity.Definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import proyecto_travelocity.Steps.Travelocity_BuscarAutos_Steps;

public class Travelocity_BuscarAutos_Definition {
	
	@Steps
	Travelocity_BuscarAutos_Steps travelocity_BuscarAutos_Steps;
	
	@Given("^Ingreso a la opcion Autos/renta de autos en la vista principal del portal$")
	public void ingresoALaOpcionAutosRentaDeAutosEnLaVistaPrincipalDelPortal() {
		travelocity_BuscarAutos_Steps.ingresoALaOpcionAutosRentaDeAutosEnLaVistaPrincipalDelPortal();
	}
	
	@Given("^realizo el filtro de busqueda de renta de autos / codigo de descuento coporativo o concentrado \"([^\"]*)\"\"([^\"]*)\"$")
	public void realizoElFiltroDeBusquedaDeRentaDeAutosCodigoDeDescuentoCoporativoOConcentrado(String destino, String destino2) {
		travelocity_BuscarAutos_Steps.realizoElFiltroDeBusquedaDeRentaDeAutosCodigoDeDescuentoCoporativoOConcentrado(destino, destino2);
	}
	

	@When("^aparecen los resultados de renta de autos, valido la busqueda$")
	public void aparecenLosResultadosDeRentaDeAutosValidoLaBusqueda() {
		travelocity_BuscarAutos_Steps.aparecenLosResultadosDeRentaDeAutosValidoLaBusqueda();
	}

	@Then("^Ingreso a una renta de auto y valido el resultado$")
	public void ingresoAUnaRentaDeAutoYValidoElResultado(){
		travelocity_BuscarAutos_Steps.ingresoAUnaRentaDeAutoYValidoElResultado();
	}
	

}
