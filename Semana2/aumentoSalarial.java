//La empresa "Compre Aquí" desea premiar a sus empleados, aplicando un aumento de salario, que va de acuerdo a la categoría del empleado de la siguiente manera:
// Si la categoría es 1 el aumento es del 15% sobre el salario actual.
// Si la categoría es 2 el aumento será de un 20% sobre el salario actual.
// Si la categoría es 3, el aumento será de un 25% sobre el salario actual.
//Determine la(s) entrada(s) y diseñe un algoritmo que imprima el nombre del empleado con su nuevo salario.

void aumentoSalarial (String nombre, double salarioActual, char categoria){
	double aumento, salarioNuevo;
	if(categoria == "1"){
		aumento = (salarioActual*0.15);
	} else {
	if(categoria == "2"){
		aumento = (salarioActual*0.20);
	} else {
		aumeto = (salarioActual*0.25);
	}
	}
	salarioNuevo = (salarioActual + aumento);
	System.out.println("El nuevo salario del empleado: " + nombre + " sera de: " + salarioNuevo);
}