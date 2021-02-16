package proyecto_travelocity.Steps;

import net.thucydides.core.annotations.Step;
import proyecto_travelocity.PageObjects.Travelocity_BuscarVuelos_PageObjects;

public class Travelocity_BuscarVuelos_Steps {

	Travelocity_BuscarVuelos_PageObjects travelocity_BuscarVuelos_PageObjects;
	
	@Step
	public void ingresoALaOpcionVuelosViajeRedondoEnLaVistaPrincipalDelPortal() {
		travelocity_BuscarVuelos_PageObjects.lanzarNavegador();
		travelocity_BuscarVuelos_PageObjects.validaElemento();
		travelocity_BuscarVuelos_PageObjects.opcionVuelos();
	}
	@Step
	public void realizoElFiltroDeBusquedaDeVuelosViajeRedondo(String origen, String destino) {
		travelocity_BuscarVuelos_PageObjects.ClickOrigen();
		travelocity_BuscarVuelos_PageObjects.IngresaOrigen(origen);
		travelocity_BuscarVuelos_PageObjects.seleccionaOrigen();
		travelocity_BuscarVuelos_PageObjects.ClickDestino();
		travelocity_BuscarVuelos_PageObjects.IngresaDestino(destino);
		travelocity_BuscarVuelos_PageObjects.seleccionaDestino();
		travelocity_BuscarVuelos_PageObjects.CambioPosInputs();
		travelocity_BuscarVuelos_PageObjects.clickCalendario();
		travelocity_BuscarVuelos_PageObjects.btn_listo();
		travelocity_BuscarVuelos_PageObjects.agregaAuto();
		travelocity_BuscarVuelos_PageObjects.Buscar();
		
	}
	@Step
	public void aparecenLosResultadosDeLosVuelosValidoLaBusqueda() {
		travelocity_BuscarVuelos_PageObjects.validaBusquedaExiste();
		
	}
	@Step
	public void seleccionoUnVueloYValidoElResultado() {
		travelocity_BuscarVuelos_PageObjects.validaBusquedaExiste();
		
	}
	
	

}
