package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual è il tuo nome?");
		String name = sc.nextLine();
		
		System.out.print("Qual è il tuo cognome?");
		String lastname = sc.nextLine();
		
		System.out.print("Qual è il tuo colore preferito?");
		String color = sc.nextLine();
		
		System.out.print("Quando sei nato?");
		String date =sc.nextLine();
		
		sc.close();
		
		String pwd = name + "-" + lastname + "-" + color + "-" + date;
		
		System.out.println("La tua password super sicura è " + pwd);
		
	}
}
