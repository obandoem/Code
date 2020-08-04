//Diseñe un algoritmo que reciba como entrada un número e imprima el cuadrado y la raíz cuadrada de éste.

void numeroCuadrado (float numero) {
	float raiz, cuadrado; 
	raiz = sqrt(numero);
	cuadrado = pow(numero, 2);
	System.out.println("La raiz cuadrada del numero es: " + raiz);
	System.out.println("El cuadrado del numero es: " + cuadrado);
}
