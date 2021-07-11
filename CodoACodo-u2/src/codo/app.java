package codo;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		/*Solicitar por pantalla*/
		Scanner sc = new Scanner(System.in);
		/*variables para guardar datos*/
		String nombre="";
		String apellido="";
		String edad="";
		String hobbie="";
		String editor="";
		String sistemaop="";
		/*pido datos*/
		System.out.println("Coloque su nombre");
		nombre = sc.nextLine();
		System.out.println("Coloque su apellido");
		apellido = sc.nextLine();
		System.out.println("Coloque su edad");
		edad = sc.nextLine();
		System.out.println("Coloque su hobbie");
		hobbie = sc.nextLine();
		System.out.println("Coloque su editor");
		editor = sc.nextLine();
		System.out.println("Coloque su sistema operativo");
		sistemaop = sc.nextLine();
		/*muestro datos*/
		System.out.println("\n"+ "Los datos ingresados fueron:"+"\n");
		System.out.println("Nombre: "+nombre+"\n");
		System.out.println("Apellido: "+apellido+"\n");
		System.out.println("Edad: "+edad+"\n");
		System.out.println("Hobbie: "+hobbie+"\n");
		System.out.println("Editor: "+editor+"\n");
		System.out.println("Sistema operativo: "+sistemaop+"\n");
		
	}
	
}
