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

  @CrearCuenta
  Scenario Outline: El usuario se registra en travelocity
    Given Ingreso a la opcion iniciar sesion y seleccion crear cuenta
    And Ingreso los datos que requiere el formulario <Nombre> <Apellidos> <Correo> <Contrasena> 
    When la cuenta ha sido creada	
    Then Ingreso a a mi perfil de usuario y valido mis datos
    Examples: 
 		| Nombre  | Apellidos | Correo               | Contrasena   |
    | pruebas2		| pruebas2	| pruebas2@yopmail.com | david1234		|

  @IniciarSesion
  Scenario Outline: El usuario Inicia Sesion en travelocity
    Given Ingreso al portal
    When Inicio sesion	<Correo><Contrasena> 
    Then Valido Ingreso Exitoso
    Examples: 
 		| Nombre   | Apellidos | Correo               | Contrasena   |
    | "pruebas2" | "pruebas2"|"pruebas2@gmail.com"| "david1234" |
    
  @BuscarHotel
  Scenario Outline: El usuario busca un hotel
    Given Ingreso a la opcion hotel en la vista principal del portal
    And realizo el filtro de busqueda <destino><origen>
    When aparecen los resultados de la busqueda, valido la busqueda
    Then Ingreso a un resultado
     Examples: 
 		| destino   | origen | Correo               | Contrasena   |
    | "bogota" | "cali"|"pruebas2@gmail.com"| "david1234" |
   
  @BuscarAutos
  Scenario: El usuario busca un Auto
    Given Ingreso a la opcion Autos en la vista principal del portal
    And realizo el filtro de busqueda
    When aparecen los resultados de la busqueda, valido la busqueda
    Then Ingreso a un resultado
    
  @BuscarPaquetes
  Scenario: El usuario busca Paquetes
    Given Ingreso a la opcion Paquetes en la vista principal del portal
    And realizo el filtro de busqueda
    When aparecen los resultados de la busqueda, valido la busqueda
    Then Ingreso a un resultado
   @BuscarVuelos
   Scenario: El usuario busca Vuelos
    Given Ingreso a la opcion vuelos en la vista principal del portal
    And realizo el filtro de busqueda
    When aparecen los resultados de la busqueda, valido la busqueda
    Then Ingreso a un resultado
   @BuscarActividades
   Scenario: El usuario busca Actividades
    Given Ingreso a la opcion actividades en la vista principal del portal
    And realizo el filtro de busqueda
    When aparecen los resultados de la busqueda, valido la busqueda
    Then Ingreso a un resultado
    
  @Tag
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
 		| Nombre  | Apellidos | Correo               | Contrasena   |
    | David		| Antonio		| dricaurtep@gmail.com | david1234		|
