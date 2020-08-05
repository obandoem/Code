//Una empresa paga a sus vendedores una comisión que va de acuerdo a las ventas que efectúa y a un código personal de comisión. Determine las entradas y diseñe un algoritmo que calcule e imprima el monto que gana por la comisión considerando:
//Si el código de comisión es 1, el porcentaje de comisión es del 10% sobre el monto de las ventas.
//Si el código de comisión está entre 2 y 5 inclusive, o es 7, el porcentaje de comisión es de 5% sobre las ventas.
//Si el código es 6, 9 o 12, el porcentaje de comisión es de 1.5%.
//Cualquier otro código de comisión recibe un porcentaje de comisión de 1% sobre las ventas.

void montoComision (int codigoComision, double montoVentas){
	//Creacion de los cuatro porcentajes.
	final double PORCENTAJE1 = 0.10;
	final double PORCENTAJE2 = 0.05; 
	final double PORCENTAJE3 = 0.015; 
	final double PORCENTAJE4 = 0.01; 
	double comision; 
	
	switch(codigoComision){
		case 1: 
		    comision = montoVentas * PORCENTAJE1; 
			break; 
		case 2:
		case 3:
		case 4:
		case 5:
		case 7: 
		    comision = montoVentas * PORCENTAJE2; 
			break; 
		case 6:
		case 9:
		case 12: 
		    comision = montoVentas * PORCENTAJE3; 
			break; 
		default:
		    comision = montoVentas * PORCENTAJE4
			break; 
	}
	System.out.println("El monto total de comisiones es de: " + comision); 
}
	
	