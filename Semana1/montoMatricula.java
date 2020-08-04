//Diseñe un algoritmo que reciba como entrada la cédula de un estudiante, la cantidad de cursos teóricos que matricula, la cantidad de cursos prácticos, calcule el monto a pagar por su matrícula sabiendo que esta corresponde a ₡5000 colones por concepto de derecho de matrícula, ₡1000 colones por cada curso teórico y ₡2000 colones por cada curso práctico.

void montoMatricula (String cedula, int cantPracticos, int cantTeoricos){
	final int MATRICULA = 5000, PRECIO_TEORICOS = 1000, PRECIO_PRACTICOS = 2000;
	int totalPagar; 
	totalPagar = MATRICULA+cantPracticos*PRECIO_PRACTICOS+cantTeoricos*PRECIO_TEORICOS; 
	System.out.println("El monto a pagar por matricula del estudiante con cedula " + cedula + " es de: " + totalPagar);
}