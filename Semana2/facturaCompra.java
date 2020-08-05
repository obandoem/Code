//El monto a pagar por una compra en un almacén corresponde a la multiplicación del precio del producto comprado por la cantidad que lleva del mismo. Determine la(s) entrada(s) y diseñe un algoritmo que calcule e imprima el desglose de una factura en la que se pueden comprar varias unidades de un único tipo de artículo, indicando el monto de la compra (subtotal), el monto del impuesto de ventas (13%) y monto total a pagar por la compra (subtotal + impuesto).

void facturaCompra (double precio, double cantidad) {
	final double IVA = 0.13; 
	double subTotal, montoImpuesto, montoTotal; 
	subTotal = (precio*cantidad); 
	montoImpuesto = (subTotal*IVA);
	montoTotal = (subTotal+montoImpuesto); 
}
