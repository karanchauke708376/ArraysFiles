package Arrays_Practice_JavaTPoint;

public class EvenPositionArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {45, 67, 12, 35, 67, 94, 34, 16, 6, 64, 15, 37, 84};
		
		for(int i = 0; i < arr.length; i = i+2) {
			
			System.out.print(arr[i]+" ");
		}
	}
}
