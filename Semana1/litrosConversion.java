//Diseñe un algoritmo que reciba como entrada un valor numérico que representará una cantidad de galones de gasolina. Debe convertir dicha cantidad a litros sabiendo que un galón corresponde a 3.785 litros.

void  (float galores) {
	final float LITROS = 3.785; 
	float conversionLitros; 
	conversionLitros = (galones*LITROS); 
	System.out.println("La cantidad de galones a litros es de: " + conversionLitros); 
}	