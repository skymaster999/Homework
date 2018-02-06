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
		
			System.out.print("Введите количество чисел, а затем количество вещественных чисел:");
		
			while(!scan.hasNextInt()) {
			
			System.out.print("Введите целое число:");
			
			scan.next();
			
			}
		
			n = scan.nextInt();
		
				for(int i =0;i<n;i++) {
			
				System.out.print("Введите число:");
			
					while(!scan.hasNextInt()) {
			
					System.out.print("Введите целое число:");
			
					scan.next();
					
					}
					
					numb = scan.nextInt();
		
				}
		
				for(int i =0;i<n;i++) {
			
				System.out.print("Введите вещественное число:");
			
					while(!scan.hasNextDouble()) {
			
					System.out.print("Введите вещественное число еще раз:");
			
					scan.next();
			
					}
			
					numb2 = scan.nextDouble();
			
					count=(int) numb2;
				
					System.out.println("Если усечь число получится "+numb2+"="+count);
			
					if (count%2 == 0)
				
						count2++;
			
					if (count>15)
		
						count3++;
			
					if(count%2 ==0)
				
						count4=count3;
			
					if(count4>15)
				
						count5++;
					
					}
			
			System.out.println("Количество вещественных четных чисел: "+count2);
			
			System.out.println("Количество чисел больше 15: "+count3);
			
			System.out.println("Количество четных чисел больше 15: "+count5);
			
	}
}