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

			System.out.print("������� a � b ��� ���������� �������� ������� F(x) �� �������[a,b]:");

			while (!scan.hasNextDouble()) {

			System.out.print("������� ������������ ��������:");

			scan.next();
			
			}
			
			a = scan.nextDouble();

			System.out.println("a=" + a);

				while (!scan.hasNextDouble()) {

				System.out.print("������� ������������ ��������:");

				scan.next();
				
				}
				
				b = scan.nextDouble();

				System.out.println("b=" + b);

					System.out.println("������� h:");

					while (!scan.hasNextDouble()) {

					System.out.print("������� ������������ ��������:");

					scan.next();

					}

			do { //�� ������ ����� ��� �� ��������

			h = scan.nextDouble();

				if (h < 0) {

				System.out.print("������� ���������� ���:");

				}

				if (h > (max - min)) {

				System.out.print("��� �������� �������,��������� ����:");

				}

			} while ((h < 0) || h > (max - min));//���� �� ����� ��� �������?

			System.out.print("h=" + h);

			System.out.print("�������� x:          ");

			System.out.print("�������� F(x):");
		
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
