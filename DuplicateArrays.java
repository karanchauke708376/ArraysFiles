package Arrays_Practice_JavaTPoint;

public class DuplicateArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {78, 65, 45, 1, 91, 1, 24, 37, 65, 91, 24};
		
		System.out.println("Duplicate Elements In Given Array : ");
		
		for(int i = 0; i < arr.length; i++) {
		
		for(int j = i + 1; j < arr.length; j++) {
			
			if(arr[i] == arr[j]) 
				
				System.out.println(arr[j]);
			}
		}
	}

}
