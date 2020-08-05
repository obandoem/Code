//Una empresa de alquiler de películas desea que usted diseñe un algoritmo para controlar el alquiler de sus videos con base a los siguientes requerimientos:
//El algoritmo debe recibir como entrada el número de formato de película que desea (1- DVD, 2-VHS, 3-CD).
//Las películas en 1-DVD cuestan 500 colones por día y las de 2-VHS cuestan 300 colones por día y las de 3-CD 100 colones el día.
//El sistema también debe recibir la cantidad de días que se desea alquilar dicha película y calcular el monto del préstamo e imprimirlo.

void alquilerPeliculas (int formato, int dia) {
	double totalPagar; 
	switch(formato) {
		case 1:
		    totalPagar = dia * 500; 
			break; 
		case 2: 
		    totalPagar = dia * 300; 
			break;
		case 3:
		    totalPagar = dia * 100; 
			break; 
		default: 
		System.out.println("El formato ingresado es invalido"); 
		break; 
	}
	System.out.println("Total a pagar es de: " + totalPagar); 
}