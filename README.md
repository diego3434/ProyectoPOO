•	nombres completos de todos los integrantes 
*Alex Paul Lascano Lincango
*Diego Alexander Toapanta Yanchaguano

•	curso/paralelo 
GR1

•	descripción breve del ejercicio desarrollado 
Desarrollo de una aplicación en Java que permite representar a un solicitante de subsidio de gasolina en Ecuador, 
aplicando conceptos de Programación Orientada a Objetos (POO).
Se implementa una clase que encapsula los datos del solicitante, como nombre, cédula, ingresos mensuales, cantidad de vehículos y residencia. 
A partir de esta información, el sistema evalúa si el solicitante cumple con los requisitos establecidos para acceder al subsidio, los cuales incluyen 
límites de ingresos, número de vehículos y residencia en el país.
Además, el programa calcula el consumo mensual estimado de gasolina mediante métodos sobrecargados, permitiendo considerar tanto un consumo base como 
kilómetros adicionales.

•	instrucciones para ejecutar el proyecto 
Ejecutar la clase Main.java.
Ingresar los datos solicitados en consola:
Nombre completo
Cédula
Ingresos mensuales
Cantidad de vehículos
Si reside en Ecuador (true/false)
El sistema mostrará:
Los datos del solicitante
El resultado de la evaluación del subsidio (aprobado o rechazado)
El cálculo del consumo mensual de gasolina

•	distribución de aportes o responsabilidades del equipo
Alex Lascano
Se encargó de la implementación principal del sistema, incluyendo la creación de la clase SolicitanteSubsidio, definición de atributos, 
constructores, métodos getters y setters, validaciones, lógica para la evaluación del subsidio (subsidioAprobado y generarResultado), 
métodos de cálculo de consumo mensual (sobrecarga de métodos) y la clase Main para la interacción con el usuario.
Diego Toapanta
Se encargó de la implementación y personalización del método toString() mediante sobrescritura (@Override), 
permitiendo mostrar de forma clara y organizada los datos del solicitante en la salida del programa.
