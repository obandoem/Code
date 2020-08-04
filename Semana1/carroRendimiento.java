//El dueño de un carro nuevo, desea conocer el rendimiento de su carro, es decir, desea saber la cantidad de kilómetros que recorre por cada galón de combustible. Para esto recorre una cantidad de kilómetros y determina la cantidad de galones de combustible consumidos para recorrer esa distancia. Diseñe un algoritmo que reciba como entradas los kilómetros recorridos y la cantidad de galones consumidos, calcule e imprima el rendimiento indicando la cantidad de kilómetros que recorre por cada galón de gasolina.

void carroRendimiento (doble kilometraje, double distancia) {
	double rendimiento; 
	rendimiento = (distancia/kilometraje);
	System.out.println("El rendimiento del carro es " + rendimiento + "kilometros por galos");
}
