//Una Universidad cobra ¢500 por materia, pero el máximo que un estudiante deberá pagar a la Universidad no debe superar el monto de ¢7500. Por ejemplo, un estudiante matricula 10 cursos pagará ¢5000 pero si matricula 18 cursos pagará el tope que son ¢7500. Diseñe un algoritmo que reciba como entrada el total de materias matriculadas y calcule el total a pagar por la matrícula.

void totalMatricula (int totalMateria ){
	final int COSTO_MATERIA = 500;
	int totalPagar; 
	totalPagar = (totalMaterias*COSTO_MATERIA);
        if(totalPagar > 7500) {
			totalPagar = 7500;
		}
		System.out.println("El total a pagar por matricula es de: " + totalPagar);
}