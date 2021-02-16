package proyecto_travelocity.Definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import proyecto_travelocity.Steps.Travelocity_BuscarPaquetes_Steps;

public class Travelocity_BuscarPaquetes_Definition {

	@Steps
	Travelocity_BuscarPaquetes_Steps travelocity_BuscarPaquetes_Steps;

	@Given("^Ingreso a la opcion Paquetes en la vista principal del portal$")
	public void ingresoALaOpcionPaquetesEnLaVistaPrincipalDelPortal() {
		travelocity_BuscarPaquetes_Steps.ingresoALaOpcionPaquetesEnLaVistaPrincipalDelPortal();
	}

	@When("^realizo el filtro de busqueda de paquetes de viaje  \"([^\"]*)\"\"([^\"]*)\"$")
	public void realizoElFiltroDeBusquedaDePaquetesDeViaje(String origen, String destino) {
		travelocity_BuscarPaquetes_Steps.realizoElFiltroDeBusquedaDePaquetesDeViaje(origen, destino);
	}

	@Then("^aparecen los resultados de busqueda de paquetes, valido la busqueda$")
	public void aparecenLosResultadosDeBusquedaDePaquetesValidoLaBusqueda() {
		travelocity_BuscarPaquetes_Steps.aparecenLosResultadosDeBusquedaDePaquetesValidoLaBusqueda();
	}
	
	
	
}
