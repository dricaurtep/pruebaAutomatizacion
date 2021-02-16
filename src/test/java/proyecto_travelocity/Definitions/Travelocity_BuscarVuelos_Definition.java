package proyecto_travelocity.Definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import proyecto_travelocity.Steps.Travelocity_BuscarVuelos_Steps;

public class Travelocity_BuscarVuelos_Definition {
	
	@Steps
	Travelocity_BuscarVuelos_Steps travelocity_BuscarVuelos_Steps;
	
	@Given("^Ingreso a la opcion vuelos/viaje redondo en la vista principal del portal$")
	public void ingresoALaOpcionVuelosViajeRedondoEnLaVistaPrincipalDelPortal() {
		travelocity_BuscarVuelos_Steps.ingresoALaOpcionVuelosViajeRedondoEnLaVistaPrincipalDelPortal();
	}

	@Given("^realizo el filtro de busqueda de vuelos/viaje redondo \"([^\"]*)\"\"([^\"]*)\"$")
	public void realizoElFiltroDeBusquedaDeVuelosViajeRedondo(String origen, String destino){
		travelocity_BuscarVuelos_Steps.realizoElFiltroDeBusquedaDeVuelosViajeRedondo(origen, destino);
	}

	@When("^aparecen los resultados de los vuelos, valido la busqueda$")
	public void aparecenLosResultadosDeLosVuelosValidoLaBusqueda() {
		travelocity_BuscarVuelos_Steps.aparecenLosResultadosDeLosVuelosValidoLaBusqueda();
	}

	@Then("^selecciono un vuelo y valido el resultado$")
	public void seleccionoUnVueloYValidoElResultado() {
		travelocity_BuscarVuelos_Steps.seleccionoUnVueloYValidoElResultado();
	}
}
