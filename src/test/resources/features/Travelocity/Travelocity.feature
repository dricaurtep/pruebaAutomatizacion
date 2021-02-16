#Author: dricaurtep@gmail.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@GestiondeViajes
Feature: El usuario puede gestionar sus viajes
y acceder a las distintas opciones que ofrece travelocity

  @BuscarHotel
  Scenario Outline: El usuario busca un hotel
    Given Ingreso a la opcion hotel en la vista principal del portal
    And realizo el filtro de busqueda <destino><origen>
    When aparecen los resultados de la busqueda, valido la busqueda
    Then Ingreso a un resultado
     Examples: 
 		| destino   | origen | Correo               | Contrasena   |
    | "bogota"  | "cali" | "pruebas2@gmail.com" | "david1234"  |
   
  @BuscarAutosRentadeAutos
  Scenario Outline: El usuario busca Renta de Autos
    Given Ingreso a la opcion Autos/renta de autos en la vista principal del portal
    And realizo el filtro de busqueda de renta de autos / codigo de descuento coporativo o concentrado <entrega><entrega2>
    When aparecen los resultados de renta de autos, valido la busqueda
    Then Ingreso a una renta de auto y valido el resultado
     Examples: 
    | entrega   | entrega2 | Correo               | Contrasena   |
    | "bogota"  | "cali"   | "pruebas2@gmail.com" | "david1234"  |
    
  @BuscarPaquetes
  Scenario Outline: El usuario busca Paquetes
    Given Ingreso a la opcion Paquetes en la vista principal del portal
    When realizo el filtro de busqueda de paquetes de viaje  <destino><origen>
    Then aparecen los resultados de busqueda de paquetes, valido la busqueda
  	 Examples: 
    	| destino   | origen | Correo               | Contrasena   |
      | "bogota"  | "cali" | "pruebas2@gmail.com" | "david1234"  |
    
    
   @BuscarVuelosViajeRedondo
   Scenario Outline: El usuario busca Vuelos de tipo viaje redondo
    Given Ingreso a la opcion vuelos/viaje redondo en la vista principal del portal
    And realizo el filtro de busqueda de vuelos/viaje redondo <destino><origen>
    When aparecen los resultados de los vuelos, valido la busqueda
    Then selecciono un vuelo y valido el resultado
     Examples: 
    | destino   | origen   | Correo               | Contrasena   |
    | "bogota"  | "cali"   | "pruebas2@gmail.com" | "david1234"  |
   @BuscarActividades
   Scenario Outline: El usuario busca Actividades
    Given Ingreso a la opcion actividades en la vista principal del portal
    When realizo el filtro de busqueda de actividad <origen>
    Then aparecen los resultados de la busqueda de actividad, valido la busqueda
     Examples: 
    | destino   | origen   | Correo               | Contrasena   |
    | "bogota"  | "cali"   | "pruebas2@gmail.com" | "david1234"  |
    
  
