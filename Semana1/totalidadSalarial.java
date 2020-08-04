//Una empresa paga a sus vendedores un salario base de c100,000.00, más el 10% de las ventas que efectúa. Determine las entradas y diseñe un algoritmo que calcule e imprima el salario total obtenido por el vendedor.

void totalidadSalarial (int montoVentas) {
	final float SALARIO_BASE = 10000, PORCENTAJE = 0.10;
	float salarioTotal;
	salarioTotal = (SALARIO_BASE+(montoVentas*PORCENTAJE));
	System.out.print("El salario total de acuerdo al monto de ventas es de: " + salarioTotal);
}	