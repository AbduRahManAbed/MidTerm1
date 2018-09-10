package math.problems;

public class PrimeNumber {

	private static int numbers  = 1000000;
	private static int a, b;
	private static int PrimeNumbers = 0;
	private static boolean Prime;

	public static void main(String[] args) {

		for(a = 2; a<numbers; a++ ) {
			Prime = true;

			for( b = 2; b<a; b++) {
				if(a%b ==0) {
					Prime = false;
					break;
				}
			} if(Prime) {
				System.out.println(a);
				PrimeNumbers++;
			}
		}
		System.out.println("Prime numbers "+ PrimeNumbers);
	}
}



