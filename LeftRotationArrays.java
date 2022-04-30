package Arrays_Practice_JavaTPoint;

public class LeftRotationArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			// Initialize array
		int arr[] = new int[] {9 , 8, 7, 6, 5, 4, 3, 2, 1};
		
			// n determine the number of the time an array should be rotated  
		int n = 3;
		
			// Display Original array
		System.out.println("Original Arrays : ");
		for(int i = 0; i < arr.length;i++) {
			
			System.out.print(arr[i] + " ");
		}
		
			// Rotate the given array by n time towards left
		for(int i = 0 ; i < n; i++) {
		
		int j,first ;
		
			// Store the array by n time toward left
		first = arr[0];
		
		for(j = 0; j < arr.length-1; j++) {
			
			// shift element of array by one
			arr[j] = arr[j+1];
			
			}
			// first element of array will be add to the end
			arr[j] = first;
			
		}
		System.out.println();
		
			// Display resulting array after rotation 
		System.out.println("\nAfter Array The Left Rotation : ");
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i] + " ");
		}
	
	}

}
