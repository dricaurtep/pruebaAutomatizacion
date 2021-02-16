package proyecto_travelocity.Steps;

import net.thucydides.core.annotations.Step;
import proyecto_travelocity.PageObjects.Travelocity_BuscarActividades_PageObjects;

public class Travelocity_BuscarActividades_Steps {
	
	Travelocity_BuscarActividades_PageObjects travelocity_BuscarActividades_PageObjects;
	
	@Step
	public void ingresoALaOpcionActividadesEnLaVistaPrincipalDelPortal() {
		travelocity_BuscarActividades_PageObjects.lanzarNavegador();
		travelocity_BuscarActividades_PageObjects.validaElemento();
		travelocity_BuscarActividades_PageObjects.opcionActividades();
		
	}
	@Step
	public void realizoElFiltroDeBusquedaDeActividad(String origen) {
		
		travelocity_BuscarActividades_PageObjects.ClickOrigen();
		travelocity_BuscarActividades_PageObjects.IngresaOrigen(origen);
		travelocity_BuscarActividades_PageObjects.seleccionaOrigen();
		travelocity_BuscarActividades_PageObjects.clickCalendario();
		travelocity_BuscarActividades_PageObjects.btn_listo();
		travelocity_BuscarActividades_PageObjects.Buscar();
	}
	@Step
	public void aparecenLosResultadosDeLaBusquedaDeActividadValidoLaBusqueda() {
		travelocity_BuscarActividades_PageObjects.validaBusquedaExiste();
		
	}

}
