package Homework;

import java.util.Scanner;

public class second {
	public static void main(String[] args) {

		double a = 0;

		double b = 0;

		double c = 0;
		
		double rez;

		Scanner sc = new Scanner(System.in);

			System.out.print("Введите a ");

			while(!sc.hasNextDouble()){
			
			System.out.print("Введите вещественное значение:");
			
			sc.next();
			
			}
			
			a = sc.nextDouble();
			
				System.out.print("Введите b ");

				while(!sc.hasNextDouble()){
					
				System.out.print("Введите вещественное значение:");
					
				sc.next();
					
				}
					
				b = sc.nextDouble();
											
					System.out.print("Введите c ");

					while(!sc.hasNextDouble()){
						
					System.out.print("Введите вещественное значение:");
					
					sc.next();
					
					}
					
					c = sc.nextDouble();
			
					
			rez = a * a - Math.pow((b - c), 2) + Math.log(b * b + 1);

			System.out.println("Ответ " + rez);

	}
}
