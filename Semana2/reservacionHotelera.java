//Una empresa hotelera posee tres categorías de hospedaje (1-Lujo, 2-Turista, 3-Negocios). Analice y determine la(s) entrada(s) para diseñar un algoritmo que calcule el monto de una reservación en algún tipo de hotel, tomando en cuenta que el precio por día de acuerdo al tipo de hotel, las cuales son:
//Categoría 1= 200,000 colones el día
//Categoría 2=100,000 colones el día
//Categoría 3=75,000 colones el día
//Recuerde que al monto de la factura se le debe sumar un 13% de impuesto de venta.

void reservacionHotelera (int categoriaHospedaje, int cantDia) {
	final double CAT1 = 200000, CAT2 = 100000, CAT3 = 75000, IVA = 0.13; 
	float subTotalFactura, totalFactura, impuesto; 
	
	switch (categoriaHospedaje) {
		case 1:
		    subTotalFactura = cantDia * CAT1;
			break; 
		case 2: 
		    subTotalFactura = cantDia * CAT2;
			break;
		case 3: 
		    subTotalFactura = cantDia * CAT3;
			break;
		default: 
		    System.out.println("La categoria ingresada es invalida");
			break;
	}
	impuesto = (subTotalFactura * IVA);
	totalFactura = (subTotalFactura + impuesto);
    System.out.println("El monto total a pagar por hospedaje es de: " + totalFactura);
}	