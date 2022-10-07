package es.bibliotecaivan.app;

import java.util.Scanner;

public class Menu {

	public static void printMenuPrincipal() {
		System.out.println("¿Que deseas hacer?");
		System.out.println("1 - Mostar");
		System.out.println("2 - Crear");
		
		Scanner scan=new Scanner(System.in);
		String opcion=scan.nextLine();
		
		switch(opcion) {
		case "1": 
			System.out.println("¿Que quieres mostrar");
			System.out.println("L - Libros");
			System.out.println("R - Resvistas");
			System.out.println("T - Resvistas y Libros");
			opcion=scan.nextLine();
			
			switch(opcion) {
			case "L": break;
			
			case "R": break;
			
			case "T": break;
			}
			break;
		
		case "2": break;
		
		default:
		}
	}
}
