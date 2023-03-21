package exercicios;

public class Operadores {
	
	public static void main(String[] args) {
		
		int a = 3, b = 7, c = 4;
		
		System.out.println((a + c) > b);
		System.out.println(b >= (a+2));
		System.out.println(c == (b-a));
		System.out.println((b + a) <= c);
		System.out.println((c + a) > b);
		
		a=5;
		b=4;
		c=3;
		int d = 6;
		
		System.out.println((a > c) && (c <= d));
		System.out.println((a + b) > 10 || (a + b) == (c + b));
		System.out.println((a >= c) && (d >= c));
		
	}
	
}
