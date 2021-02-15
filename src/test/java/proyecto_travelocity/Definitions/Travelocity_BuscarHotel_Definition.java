package proyecto_travelocity.Definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import proyecto_travelocity.Steps.Travelocity_BuscarHotel_Steps;

public class Travelocity_BuscarHotel_Definition {

	@Steps
	Travelocity_BuscarHotel_Steps travelocity_BuscarHotel_Steps;
	
	@Given("^Ingreso a la opcion hotel en la vista principal del portal$")
	public void ingresoALaOpcionHotelEnLaVistaPrincipalDelPortal()  {
		travelocity_BuscarHotel_Steps.ingresoALaOpcionHotelEnLaVistaPrincipalDelPortal();
	}

	@Given("^realizo el filtro de busqueda \"([^\"]*)\"\"([^\"]*)\"$")
	public void realizoElFiltroDeBusqueda(String destino, String origen) {
		travelocity_BuscarHotel_Steps.realizoElFiltroDeBusqueda(destino, origen);
	}


	@When("^aparecen los resultados de la busqueda, valido la busqueda$")
	public void aparecenLosResultadosDeLaBusquedaValidoLaBusqueda() {
		travelocity_BuscarHotel_Steps.aparecenLosResultadosDeLaBusquedaValidoLaBusqueda();
	}

	@Then("^Ingreso a un resultado$")
	public void ingresoAUnResultado() {
		travelocity_BuscarHotel_Steps.ingresoAUnResultado();
	}
	
}
