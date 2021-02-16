package proyecto_travelocity.Steps;

import net.thucydides.core.annotations.Step;
import proyecto_travelocity.PageObjects.Travelocity_BuscarPaquetes_PageObjects;

public class Travelocity_BuscarPaquetes_Steps {

	Travelocity_BuscarPaquetes_PageObjects travelocity_BuscarPaquetes_PageObjects;
	
	@Step
	public void ingresoALaOpcionPaquetesEnLaVistaPrincipalDelPortal() {
		travelocity_BuscarPaquetes_PageObjects.lanzarNavegador();
		travelocity_BuscarPaquetes_PageObjects.validaElemento();
		travelocity_BuscarPaquetes_PageObjects.opcionPaquetes();
		
	}
	@Step
	public void realizoElFiltroDeBusquedaDePaquetesDeViaje(String origen, String destino) {
		
		travelocity_BuscarPaquetes_PageObjects.lblfiltro();
		travelocity_BuscarPaquetes_PageObjects.ClickOrigen();
		travelocity_BuscarPaquetes_PageObjects.IngresaOrigen(origen);
		travelocity_BuscarPaquetes_PageObjects.seleccionaOrigen();
		travelocity_BuscarPaquetes_PageObjects.ClickDestino();
		travelocity_BuscarPaquetes_PageObjects.IngresaDestino(destino);
		travelocity_BuscarPaquetes_PageObjects.seleccionaDestino();
		travelocity_BuscarPaquetes_PageObjects.clickCalendario();
		travelocity_BuscarPaquetes_PageObjects.btn_listo();
		travelocity_BuscarPaquetes_PageObjects.clasePaquete();
		travelocity_BuscarPaquetes_PageObjects.Buscar();
	}
	@Step
	public void aparecenLosResultadosDeBusquedaDePaquetesValidoLaBusqueda() {
		travelocity_BuscarPaquetes_PageObjects.validaBusquedaExiste();
		
	}

}
