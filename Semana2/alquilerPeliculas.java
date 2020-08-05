//Diseñe un algoritmo que calcule e imprima el monto a pagar por el alquiler de películas de video, si se sabe que cada película tiene un costo de ¢400 por día. El algoritmo debe recibir como entrada la cantidad de películas que se alquilan y la cantidad de días que se las lleva el cliente. Imprima el monto total a pagar por el alquiler de las películas.

void alquilerPeliculas (int cantPeliculas, int cantDias){
	double montoPagar; 
	montoPagar = (cantPeliculas*400*cantDias); 
	System.out.println("El monto total es de: " + montoPagar);
}
	