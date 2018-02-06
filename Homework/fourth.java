package Homework;

import java.util.Scanner;

public class fourth {

	public static void main(String[] args) {
	
		double a = 0;
		
		double b = 0;
		
		double c = 0;
		
		double rez = 0 ;
		
		double rez2 = 0;
		
		Scanner scan = new Scanner(System.in);
			
			System.out.print("Zapros a: ");
						
			while(!scan.hasNextDouble()) {
					
			System.out.print("Nevernoe a");
					
			scan.next();
					
			}
				
			a = scan.nextDouble();
			
				System.out.print("Zapros b: ");
			
				while(!scan.hasNextDouble()) {
					
				System.out.print("Nevernoe b: ");
					
				scan.next();
					
				}
				
				b = scan.nextDouble();
			
					if ( a==b ) {
			
					System.out.print("New Year!");
						
					} else {
						
							System.out.print("Zapros c: ");
						
							while(!scan.hasNextDouble()) {
							
							System.out.print("Nevernoe c");
							
							scan.next();
							
							}
						
						c = scan.nextDouble();
						
						rez = a+b+c;
							
						rez2 = a*a+b*b;
							
						System.out.println("-a+b+c= "+rez);
							
						System.out.println("-a*a+b*b= "+rez2);
							
						System.out.println("-Arsenal");
							
		}
					
	}
	
}