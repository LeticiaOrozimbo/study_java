package poo;

import java.util.Locale;
import java.util.Scanner;

public class Program_Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee x = new Employee();
		
		System.out.print("Enter employee name: ");
		x.name = sc.nextLine();
		System.out.print("Enter employee gross salary: ");
		x.grossSalary = sc.nextDouble();
		System.out.print("Enter employee tax: ");
		x.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + x);
		System.out.println();
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		x.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Update data: " + x);
	
		sc.close();
	}

}
