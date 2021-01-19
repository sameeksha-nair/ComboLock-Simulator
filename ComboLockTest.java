package Assignment2;

import java.util.Scanner;

public class ComboLockTest {

	public static void main(String args[]) {
		
		Scanner in= new Scanner(System.in);
		int num1=0, num2=0, num3=0;
		ComboLock lock;
		System.out.println("Enter a three combo lock from (0-39): ");
		num1= in.nextInt();
		num2= in.nextInt();
		num3= in.nextInt();
		boolean check=false;
		lock= new ComboLock(num1, num2, num3);
		do{
			while(check==false) {
				
					System.out.println("Enter number of ticks for first number: ");
					num1= in.nextInt();
					lock.turnRight(num1);
			
					System.out.println("Enter number of ticks for second number: ");
					num2= in.nextInt();
					lock.turnLeft(num2);
			
					System.out.println("Enter number of ticks for third number: ");
					num3= in.nextInt();
					lock.turnRight(num3);
			
					check= lock.open();
					
			}
			check=false;
			System.out.println("Enter a three combo lock from (0-39): ");
			num1= in.nextInt();
			num2= in.nextInt();
			num3= in.nextInt();
			lock= new ComboLock(num1, num2, num3);
			
		} while(num1!=0 && num2!=0 && num3!=0);
		
		System.out.println("Closed");
	}
}
