package Arrays_Practice_JavaTPoint;

public class Araay_FindMinValues {
	
	// Creating a method which receives an array as a parameter 
	
		static void min(int arr[]) {
			
			int min = arr[0];
			
			for(int i = 1; i < arr.length; i++) 
				
				if(min > arr[i])
					min = arr[i];
			
			System.out.println("Min Values Of Arr : " +min);
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {78, 94, 64, 57, 34, 14, 2, 39,7};
		
		min(arr);
		
		
	}

}
