/* print tables of 1 to 10 number */

import java.util.Scanner;

public class tableofno {

	public static void main(String[] args) {

		for (int table = 1; table <= 10; table++) {
			for (int i = 1; i <= 10; i++) {

				System.out.println(table + " * " + (i) + " = " + (table * (i)));
			}
			System.out.println("-x--x--x--x--x-");

		}
	}
}
