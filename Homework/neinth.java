package Homework;

import java.util.Scanner;

public class neinth {

	public static void main(String[] args) {

		double a = 0;

		double b = 0;

		double x = 0;

		double f = 0;

		double h = 0;

		double min = 0;

		double max = 0;

		Scanner scan = new Scanner(System.in);

		min = Math.min(a, b);

		max = Math.max(a, b);

			System.out.print("¬ведите a и b дл€ вычислени€ значений функций F(x) на отрезке[a,b]:");

			while (!scan.hasNextDouble()) {

			System.out.print("¬ведите вещественные значени€:");

			scan.next();
			
			}
			
			a = scan.nextDouble();

			System.out.println("a=" + a);

				while (!scan.hasNextDouble()) {

				System.out.print("¬ведите вещественные значени€:");

				scan.next();
				
				}
				
				b = scan.nextDouble();

				System.out.println("b=" + b);

					System.out.println("¬ведите h:");

					while (!scan.hasNextDouble()) {

					System.out.print("¬ведите вещественные значени€:");

					scan.next();

					}

			do { //не совсем пон€л как он работает

			h = scan.nextDouble();

				if (h < 0) {

				System.out.print("¬ведите нормальный шаг:");

				}

				if (h > (max - min)) {

				System.out.print("Ўаг превысил отрезок,повторный ввод:");

				}

			} while ((h < 0) || h > (max - min));//пока не будет это условие?

			System.out.print("h=" + h);

			System.out.print("«начение x:          ");

			System.out.print("«начение F(x):");
		
			if (h > 0) {

				while ((min <= max)) {

				x = min;

				f = 2 * Math.tan(x / 2) + 1;

				min = min + h;

				System.out.print("   " + x + "          ");

				System.out.print(f);
				
				}
				
			}
	}
}
