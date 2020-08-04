//Para calcular el área de un triángulo se multiplica la medida de su base por su altura y se divide entre dos.
//Diseñe un algoritmo que reciba como entrada la medida de la base y la altura del triángulo. Debe calcular y retornar el área del mismo.

void areaTringular (float base, float altura) {
	float area; 
	area = (base*altura)/2;
	System.out.println("El area del triangulo es: " + area); 
}