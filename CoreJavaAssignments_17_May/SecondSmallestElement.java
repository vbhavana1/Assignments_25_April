import java.util.Arrays;
class SecondSmallestElement{

public static int getSeconSmallestElement( int []arr){
	
	Arrays.sort(arr);
	
	 int  result = arr[arr.length-2];


	return result ;
}

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Print the length of an array ");
		 int num = sc. nextInt();
		 int arr[] = new int [num];
		 System.out.println("Enter the elements to an array");
		 for( int i= 0; i < arr.length; i++){
		 	arr[i] = sc.nextInt();
		 }
		  
		 new SecondSmallestElement().getSeconSmallestElement(arr);
		  System.out.println(" Second Smallest number in an array is "+ getSeconSmallestElement(arr));


		
	}
}