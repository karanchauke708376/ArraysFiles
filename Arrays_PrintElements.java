package Arrays_Practice_JavaTPoint;

import java.util.Scanner;

public class Arrays_PrintElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of Arrays :");
		int size = sc.nextInt();
		
		System.out.println("Enter The Store Array Elements : ");
		int number[] = new int [size];
		
		for(int i = 0; i < size; i++) {
			
			number[i] = sc.nextInt();
		}
		
		for(int i = 0; i < size; i++) {
			
			System.out.print(number[i]+ " ");
		}
		
	}
}
