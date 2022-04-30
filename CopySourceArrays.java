package Arrays_Practice_JavaTPoint;

public class CopySourceArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] copyFrom = {'d','e','c','a','f','f','e','i','n','a','t','e','d'};
		
		// Declare a Destination array
		
		char[] copyTo = new char[7];
		
		// copying array using system.arraycopy() method
		
		System.arraycopy(copyFrom, 2, copyTo, 0, 7);
		
		// passing the destination array
		System.out.println(String.valueOf(copyTo));
		
	}

}
