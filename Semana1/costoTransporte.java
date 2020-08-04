//Una empresa de transporte de paquetes desea que usted le diseñe un algoritmo que le permita calcular el costo del transporte de un paquete, sabiendo que la forma en que se calculará el costo será: por cada kilo de peso se cobra ₡100, por cada kilómetro que se debe recorrer para llevar el paquete a su destino se cobra ₡500 y adicionalmente se cobra el 10% del valor del contenido del paquete.

void costoTransporte (double peso, double valorContenido, double kms){
	final double PRECIO_KILO = 100, PRECIO_KM = 500; 
	double costoPeso, costoContenido, costoKms, costoTotal;
	costoPeso = (peso*PRECIO_KILO);
	costoKms = (kms*PRECIO_KM);
	costoContenido = (valorContenido*0.10);
	costoTotal = (costoPeso+costoKms+costoContenido);
	System.out.println("El costo total por el transporte es: " + costoTotal);
}