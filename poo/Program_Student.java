package poo;

import java.util.Locale;
import java.util.Scanner;

public class Program_Student {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student x = new Student();
		
		System.out.print("Name: ");
		x.name = sc.nextLine();
		System.out.print("Nota 1: ");
		x.nota1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		x.nota2 = sc.nextDouble();
		System.out.print("Nota 3: ");
		x.nota3 = sc.nextDouble();
		
		System.out.println();
		System.out.println("FINAL GRADE: " + x.finalGrade());

		if(x.finalGrade() >= 60) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED ");
			System.out.println("MISSING " + x.missing() + " POINTS");
		}
		
		sc.close();
			
}
}
