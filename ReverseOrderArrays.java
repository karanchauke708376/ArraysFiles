package Arrays_Practice_JavaTPoint;

public class ReverseOrderArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {78, 64, 12, 34, 69, 82, 34, 51, 34};
		
		System.out.println("Origina Arrays : ");
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i] + " ");
			
		}
		
		System.out.println("\nReverse Order : ");
		for(int i = arr.length-1; i >= 0; i--) {
			
			System.out.print(arr[i]+" ");
		
		}
	}

}
