package Homework;

import java.util.Scanner;

public class tenth {

	public static void main(String[] arqs) {

		double x = 0;

		double f = 0;

		Scanner scan = new Scanner(System.in);

			System.out.print("¬ведите x:");

			while (!scan.hasNextDouble()) {

			System.out.print("Type only Double:");

			scan.next();
			
			}

			x = scan.nextDouble();

				if (x <= -3) {

				System.out.print("F(x)=9");

					} else if (x > 3) {

					f = 1 / (x * x + 1);

					System.out.print("F(x)=" + f);

						} else {

						System.out.print("х не может принимать таких значений!");

						}
	}
}
