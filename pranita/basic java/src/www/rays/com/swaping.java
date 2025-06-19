package www.rays.com;

public class swaping {
	public static void main (String[] args) {
		int a = 4;
		int b = 10;
		int c = 0;
		System.out.println("before swaping");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		System.out.println("after swaping");
		
		c = a; // c = 5;
		a = b; // a = 10;
		b = c; // c = 5;
		
		System.out.println(" a= " +a);
		System.out.println("b = " + b);

	}

}
