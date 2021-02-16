package proyecto_travelocity.Steps;

import net.thucydides.core.annotations.Step;
import proyecto_travelocity.PageObjects.Travelocity_BuscarAutos_PageObjects;

public class Travelocity_BuscarAutos_Steps {

	Travelocity_BuscarAutos_PageObjects travelocity_BuscarAutos_PageObjects;
	
	@Step
	public void ingresoALaOpcionAutosRentaDeAutosEnLaVistaPrincipalDelPortal() {
		travelocity_BuscarAutos_PageObjects.lanzarNavegador();
		travelocity_BuscarAutos_PageObjects.validaElemento();
		travelocity_BuscarAutos_PageObjects.opcionAutos();
	}
	@Step
	public void realizoElFiltroDeBusquedaDeRentaDeAutosCodigoDeDescuentoCoporativoOConcentrado(String destino,
			String destino2) {
		travelocity_BuscarAutos_PageObjects.ClickDestino();
		travelocity_BuscarAutos_PageObjects.IngresaDestino(destino);
		travelocity_BuscarAutos_PageObjects.seleccionaDestino();
		travelocity_BuscarAutos_PageObjects.ClickDestino2();
		travelocity_BuscarAutos_PageObjects.IngresaDestino2(destino);
		travelocity_BuscarAutos_PageObjects.seleccionaDestino2();
		travelocity_BuscarAutos_PageObjects.clickCalendario();
		travelocity_BuscarAutos_PageObjects.btn_listo();
		travelocity_BuscarAutos_PageObjects.listSelectHoraEntrega();
		travelocity_BuscarAutos_PageObjects.listSelectHoraDevolucion();
		travelocity_BuscarAutos_PageObjects.incluirTarifas();
		travelocity_BuscarAutos_PageObjects.codigoDescuento();
		travelocity_BuscarAutos_PageObjects.Arrendadora();
		travelocity_BuscarAutos_PageObjects.TipoDescuento();
		travelocity_BuscarAutos_PageObjects.IngresarCodigoDescuento();
		travelocity_BuscarAutos_PageObjects.Buscar();
		
	}
	@Step
	public void aparecenLosResultadosDeRentaDeAutosValidoLaBusqueda() {
		travelocity_BuscarAutos_PageObjects.validaBusquedaExiste();
		
	}
	@Step
	public void ingresoAUnaRentaDeAutoYValidoElResultado() {
		travelocity_BuscarAutos_PageObjects.validaBusquedaExiste();
		
	}
	
	

}
