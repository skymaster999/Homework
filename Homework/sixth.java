package Homework;

import java.util.Scanner;

public class sixth {

	public static void main(String[] args) {

		int n = 0;
		
		int numb = 0;
		 
		double numb2 = 0;
		
		int count = 0;
		
		int count2 = 0;
		
		int count3 = 0;
		
		int count4 = 0;
		
		int count5 = 0;
		
		Scanner scan = new Scanner(System.in);
		
			System.out.print("������� ���������� �����, � ����� ���������� ������������ �����:");
		
			while(!scan.hasNextInt()) {
			
			System.out.print("������� ����� �����:");
			
			scan.next();
			
			}
		
			n = scan.nextInt();
		
				for(int i =0;i<n;i++) {
			
				System.out.print("������� �����:");
			
					while(!scan.hasNextInt()) {
			
					System.out.print("������� ����� �����:");
			
					scan.next();
					
					}
					
					numb = scan.nextInt();
		
				}
		
				for(int i =0;i<n;i++) {
			
				System.out.print("������� ������������ �����:");
			
					while(!scan.hasNextDouble()) {
			
					System.out.print("������� ������������ ����� ��� ���:");
			
					scan.next();
			
					}
			
					numb2 = scan.nextDouble();
			
					count=(int) numb2;
				
					System.out.println("���� ����� ����� ��������� "+numb2+"="+count);
			
					if (count%2 == 0)
				
						count2++;
			
					if (count>15)
		
						count3++;
			
					if(count%2 ==0)
				
						count4=count3;
			
					if(count4>15)
				
						count5++;
					
					}
			
			System.out.println("���������� ������������ ������ �����: "+count2);
			
			System.out.println("���������� ����� ������ 15: "+count3);
			
			System.out.println("���������� ������ ����� ������ 15: "+count5);
			
	}
}