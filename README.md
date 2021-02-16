# pruebaAutomatizacion
Portal Travelocity

Generar Reporte:
Click derecho sobre el proyecto > Show In > Terminal
Se activará la consola Terminal, en esta se debe escribir el siguiente comando: mvn serenity:aggregate

Una vez generado el reporte, clic derecho al folder:
/target/site/serenity > Properties > Dar clic al botón “Show in system explorer”
Ubicar en la carpeta el archive index.html.

-- En el paquete .Runner se encuentra la clase Travelocity_Runner
-- En comentarios estan los @tags de los escenarios de prueba para correrlos por separado
-- el tag @GestiondeViajes recorre todos los escenarios del feature
-- Surgen problemas al correr la automatizacion algunas veces cuando se abre el navegador, porque el portal web cambia el diseño en ocasiones,
   sin embargo al correr de nuevo el escenario el diseño del portal se logra ajustar de nuevo al mapeo de los elementos de la automatizacion.
