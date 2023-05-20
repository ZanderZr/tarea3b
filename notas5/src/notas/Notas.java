package notas;

import java.util.Scanner;

public class Notas {

public static void main(String[] args) {
cali();
}

/**
 * 
 */
public static void cali() {
	Scanner reader = new Scanner(System.in);// Para pedir un dato numérico por teclado
	int notas = 0;
	String c = "";
	System.out.print("Introduzca el valor de una calificación: ");
	notas = reader.nextInt();
	
	if (notas >= 0 && notas < 5)
	c = "Suspenso";
	else if (notas >= 5 && notas < 7)
	c = "Aprobado";
	else if (notas >= 7 && notas <9)
	c = "Notable";
	else if (notas >= 9 && notas <= 10)
	c = "Sobresaliente";
	else
	c = "El valor de la calificación introducida no es correcta";
	
	System.out.println(c);
	reader.close();
}
}