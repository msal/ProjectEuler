package de.msal.euler;

/**
 * By considering the terms in the Fibonacci sequence whose values do not exceed
 * four million, find the sum of the even-valued terms.
 * 
 * 
 * Each new term in the Fibonacci sequence is generated by adding the previous
 * two terms. By starting with 1 and 2, the first 10 terms will be:
 * 
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 
 * By considering the terms in the Fibonacci sequence whose values do not exceed
 * four million, find the sum of the even-valued terms.
 */

public class Prob002 {

	private static long sum;

	public static void main(String[] args) {

		for (int i = 2; true; i++) {
			long fibTmp = fib(i);
			if (fibTmp <= 4000001) { // value < 4 mio (+1, because i=2)?
				if (fibTmp % 2 == 0) { // value even?
					sum += fibTmp;
					System.out.println(fibTmp);
				} else {
					System.out.println(" (" + fibTmp + ")");
				}
			} else {
				break;
			}
		}
		System.out.println("\nSum of the even-valued terms: " + sum);
	}

	/**
	 * Calculates the Fibonacci sequence for a given number.
	 * 
	 * @param n
	 *            the number of which the sequence should be calculated
	 * @return the calculated value.
	 */
	private static long fib(int n) {
		if (n <= 1)
			return n;
		else
			return fib(n - 1) + fib(n - 2);
	}

}