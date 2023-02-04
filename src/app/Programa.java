package app;

import java.util.Locale;
import java.util.Scanner;

import node.List;

public class Programa {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List list = new List();
		
		int op ;
			do {
			showMenu();	
			op = sc.nextInt();
			
				switch (op) {
				case 1: {
					System.out.println("add number : ");
					double value = sc.nextDouble();
					list.add(value);
				break;
				}
				case 2: {
					System.out.println(list.toString());
				break;
				}
				case 3: {
				System.out.println("fim do programa");
				}
				default:
				System.out.println("opçao invalida!!");
				}
			
			} while (op != 3);

		sc.close();
	}
	
	public static void showMenu() {
		System.out.println("1 - adicionar na lista");
		System.out.println("2 - mostrar lista");
		System.out.println("3 - sair");
	}
	
}
