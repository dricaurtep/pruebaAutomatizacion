package proyecto_travelocity.Definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import proyecto_travelocity.Steps.Travelocity_BuscarActividades_Steps;

public class Travelocity_BuscarActividades_Definition {
	
	@Steps
	Travelocity_BuscarActividades_Steps Travelocity_BuscarActividades_Steps;
	
	@Given("^Ingreso a la opcion actividades en la vista principal del portal$")
	public void ingresoALaOpcionActividadesEnLaVistaPrincipalDelPortal() {
		Travelocity_BuscarActividades_Steps.ingresoALaOpcionActividadesEnLaVistaPrincipalDelPortal();
	}

	@When("^realizo el filtro de busqueda de actividad \"([^\"]*)\"$")
	public void realizoElFiltroDeBusquedaDeActividad(String origen) {
		Travelocity_BuscarActividades_Steps.realizoElFiltroDeBusquedaDeActividad(origen);
	}

	@Then("^aparecen los resultados de la busqueda de actividad, valido la busqueda$")
	public void aparecenLosResultadosDeLaBusquedaDeActividadValidoLaBusqueda() {
		Travelocity_BuscarActividades_Steps.aparecenLosResultadosDeLaBusquedaDeActividadValidoLaBusqueda();
	}
	
	
}
