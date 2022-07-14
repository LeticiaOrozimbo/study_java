
public class funcoes_string {
	
	public static void main(String[] args) {
		 
		String inicial = "abcde FGHIJ ABC abc DEFG";
		
		String s01 = inicial.toLowerCase();
		String s02 = inicial.toUpperCase();
		String s03 = inicial.trim();
		String s04 = inicial.substring(2);
		String s05 = inicial.substring(2, 9);
		String s06 = inicial.replace('a', 'x');
		String s07 = inicial.replace("abc", "xy");
		int i = inicial.indexOf("bc");
		int j = inicial.lastIndexOf("bc");
		
		
		System.out.println("Inicial: -" + inicial + " -");
		System.out.println("toLowerCase: -" + s01 + " -");
		System.out.println("toUpperCase: -" + s02 + " -");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + " -");
		System.out.println("substring(2, 9): -" + s05 + " -");
		System.out.println("substring('a', 'x'): -" + s06 + " -");
		System.out.println("substring('abc', 'xy'): -" + s07 + " -");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);
		
	}

}
