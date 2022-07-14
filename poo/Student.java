package poo;

public class Student {

	public String name;
	public double nota1;
	public double nota2;
	public double nota3;

	public double finalGrade() {
		return (nota1 + nota2 + nota3);
	}

	public double missing() {
		return 60.0 - (nota1 + nota2 + nota3);

	}

	public String toString() {
		return name + String.format("%.2f", finalGrade());
	}

}
