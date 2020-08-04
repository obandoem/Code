//Diseñe un algoritmo que reciba como entrada el radio de un círculo. Debe calcular imprimir el diámetro, el área y el perímetro utilizando el valor del radio indicado.

void circuloRadio (float radio){
	final float PI = 3.14;
	float diametro, perimetro, area;
	diametro = (2*radio);
	perimetro = (2*PI*radio);
	area = (PI*pow(radio,2));
	System.out.println("El diametro del perimetro es de: " + diametro);
	System.out.println("El perimetro es de: " + perimetro); 
	System.out.println("El area es de: " + area); 
}
