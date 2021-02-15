package proyecto_travelocity.Steps;

import proyecto_travelocity.PageObjects.Travelocity_BuscarHotel_PageObjects;

public class Travelocity_BuscarHotel_Steps {

	Travelocity_BuscarHotel_PageObjects travelocity_BuscarHotel_PageObjects;
	
	public void ingresoALaOpcionHotelEnLaVistaPrincipalDelPortal() {
		travelocity_BuscarHotel_PageObjects.lanzarNavegador();
		travelocity_BuscarHotel_PageObjects.validaElemento();
		travelocity_BuscarHotel_PageObjects.opcionHotel();
	}

	public void realizoElFiltroDeBusqueda(String destino, String origen) {
		travelocity_BuscarHotel_PageObjects.ClickDestino();
		travelocity_BuscarHotel_PageObjects.IngresaDestino(destino);
		travelocity_BuscarHotel_PageObjects.seleccionaDestino();
		travelocity_BuscarHotel_PageObjects.agregarVuelo();
		travelocity_BuscarHotel_PageObjects.nuevoOrigen();
		travelocity_BuscarHotel_PageObjects.ingresaOrigen(origen);
		travelocity_BuscarHotel_PageObjects.seleccionaOrigen();
		travelocity_BuscarHotel_PageObjects.agregaAuto();
		travelocity_BuscarHotel_PageObjects.clickCalendario();
		travelocity_BuscarHotel_PageObjects.btn_listo();
		travelocity_BuscarHotel_PageObjects.selec_personas();
		travelocity_BuscarHotel_PageObjects.agrega_adultos();
		travelocity_BuscarHotel_PageObjects.agrega_ninos();
		travelocity_BuscarHotel_PageObjects.listSelect();
		travelocity_BuscarHotel_PageObjects.agregar_Habitacion();
		travelocity_BuscarHotel_PageObjects.agregarAdultosHabDos();
		travelocity_BuscarHotel_PageObjects.eliminar_habitacion();
		travelocity_BuscarHotel_PageObjects.listoHotel();
		travelocity_BuscarHotel_PageObjects.Buscar();
		
	}

	public void aparecenLosResultadosDeLaBusquedaValidoLaBusqueda() {
		travelocity_BuscarHotel_PageObjects.validaBusquedaExiste();
		
	}

	public void ingresoAUnResultado() {
		travelocity_BuscarHotel_PageObjects.clickResultado();
		travelocity_BuscarHotel_PageObjects.validaIngresoResultadoExiste();
		
	}

}
