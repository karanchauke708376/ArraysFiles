
package Arrays_Practice_JavaTPoint;

public class Clonig_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {3, 7, 88, 54, 61, 29, 75, 9};
		
		System.out.println("Printing Original Arrays : ");
		
		for(int i: arr)
			
			System.out.print(i+" ");
		
		System.out.println("\nPrinting Clone Of The Array : ");
		
		int carr[] = arr.clone();
		
		for(int i: carr)
			
			System.out.print(i+" ");
		
		System.out.println("\nAre Both Equal : ");
		System.out.println(arr == carr);
		
	}

}
