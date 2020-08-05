//Determine la(s) entrada(s) y diseñe un algoritmo que calcule el monto a pagar por el transporte de un cargamento, tomando en cuenta que: si el peso total de la carga es menor a 50 toneladas, cada tonelada cuesta 1000 colones, si el peso de la carga es mayor o igual a 50 toneladas, cada una de ellas cuesta 1500.

void montoCargamento (double pesoToneladas){
	double montoPagar; 
	if (pesoToneladas < 50 ){
		montoPagar = (PesoToneladas*1000); 
	} else {
		montoPagar = (pesoToneladas*1500);
	}
	System.out.println("El monto total a pagar por el peso de carga es de: " + montoPagar);
}
