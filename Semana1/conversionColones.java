//Diseñe un algoritmo que reciba como entrada un valor numérico que representará una cantidad en colones, convierta dicha cantidad a dólares, sabiendo que el tipo de cambio es de 545 colones por dólar.

void conversionMoneda ( float colones) {
	final int CAMBIO = 545;
	float conversion; 
	conversion = colones/CAMBIO;
	System.out.println("La conversion de " + colones + " , a dolares es de: " + conversion);
} 

