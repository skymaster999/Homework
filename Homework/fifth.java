package Homework;

import java.util.Scanner;

public class fifth {

	public static void main(String[] args) {
		
		int a = 0;

		int b = 0;

		int sum = 0;

		int mod = 0;

		int even = 0;

		Scanner scan = new Scanner(System.in);

			System.out.print("Vvedite kol chisel: ");

			while (!scan.hasNextInt()) {
			
			System.out.print("Vvedite celoe");
			
			scan.next();
			
			}
		
			a = scan.nextInt();

				for (int i = 0; i < a; i++) {

				System.out.print("Vvedite chislo: ");

					while (!scan.hasNextInt()) {

					System.out.print("Vvedite celoe");

					scan.next();

					}

					b = scan.nextInt();

				if (b % 2 == 0) {

				even++; //почему так even++

					} else if (b % 3 == 0) {

					sum = sum + b;

						} else if (Math.abs(b) < 3) {

						mod++;//и тут почему mod++
						
						}
				
				}

		System.out.println("Колисество четных чисел:" + even);
		
		System.out.println("Сумма кратных 3:" + sum);
		
		System.out.println("Количество чисел, модуль которых меньше 3:" + mod);

	}

}
