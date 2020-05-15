package base;

import java.util.Scanner;

public class TestThrowException {

	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enetr your age:");
		age = sc.nextInt();

		try {
			if ( age < 18) { throw new AgeException();
			}
			else { 
			System.out.println(" u can vote!");
		}
	}
		catch (AgeException ae) {
			System.out.println(" u r not elegible to vote!");
		}
		
	}
}

