//Diseñe un algoritmo que reciba como entradas las horas trabajadas y el salario por hora de un trabajador y calcule su salario total y neto tomando en cuenta que:
//Para calcular el salario total se sabe que las primeras 40 horas trabajadas se pagan a su salario por hora, pero si trabajó más de 40 horas dichas horas se toman como extras y se pagan como hora y media cada una.
//Una vez calculado su salario total se calculan las deducciones de la siguiente forma:
//La deducción del seguro social es de 9% sobre el salario total.
//Si el salario total es menor o igual a ₡100,000 no se le rebaja el impuesto de la renta.
//Si el salario total es mayor ₡100,000 y menor o igual a ₡500,000 se rebajará el 10% sobre el exceso de los ₡100,000.
//Si el salario total excede los ₡500,000 se rebajará el 10% sobre los ₡400,000 que van desde los ₡100,000 hasta los ₡500,000 y el 15% sobre el exceso de los ₡500,000.
//El algoritmo debe imprimir el salario total y el neto (salario bruto menos deducciones).

void salarioFinal (int horas, double salarioHora) {
	
	//Se requieren 3 porcentajes para rebajar. 
	final doble CCSS = 0.09;
	final double PORCENTAJE1 = 0.10;
	final double PORCENTAJE2 = 0.15;
	
	//Declaracion de las futuras variables. 
	double salarioBruto, salarioNeto, montoImpuesto, deduccionCaja; //Agrupacion de las variables por tipo. 
	int horasExtras; 
	
	if(horas <= 40){
		salarioBruto = (horas *salarioHora) // Las primeras 40h se pagan normal. 
	} else {
		extras = (horas - 40);
		salarioBruto = (40*salarioHora+extras*1.5*salarioHora); // Las extras se pagan a 1.5.
	}
	
	//Indentificacion de la deduccionCaja.
	deduccionCaja = (salarioBruto * CCSS);
	
	//Indentificacion del salario a los +100000. 
	if (salarioBruto <= 100000) { 
	montoImpuesto = 0;
	} else {
		if (salarioBruto > 100000 && salarioBruto <= 500000){
			montoImpuesto = ((salarioBruto - 100000) * PORCENTAJE1)
		} else {
			montoImpuesto = 400000 * PORCENTAJE1 + (salarioBruto - 500000) * PORCENTAJE2;
		}
	}
	salarioNeto = salarioBruto - deduccionCaja - montoImpuesto;
	System.out.println("El salario bruto del empleado es de:" + salarioBruto);
	System.out.println("El salario neto del empleado es de: " + salarioNeto);
}
	