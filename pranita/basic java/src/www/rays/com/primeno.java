package www.rays.com;

public class primeno {
	public static void main (String []args) {
		int i = 6;
		int count = 0;
		for (int a =4; a < 1; a++) {
			if (i % a==0) {
				count ++;
			}
		}
			 if (count > 0) {
				System.out.println(i + "is not prime " );
			}else {
				System.out.println(i + "is a prime no" );
			}
		}
	}


