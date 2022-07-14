package introduce;
import java.util.Locale;

public class exericio {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Oficce desk";

		byte age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products: "+ "\n"+product1+",which price is $" + price1);
		System.out.println(product2+",which price is $" + price2); 
		System.out.println("\nRecord:"+ age + "years old,"+ code+ "5290 and gender:" + gender);
		System.out.printf("\nMeasure with eight decimal places:"+"%.8f", measure);
		System.out.print("\nRouded(three decimal places):");
		System.out.printf("%.2f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point:" + "%.3f",measure);
	}

}
