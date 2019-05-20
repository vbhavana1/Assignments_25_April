import java.util.Arrays;
class ReverseArrayNum{

	public int[] getSorted(int []arr){
		int rev = 0;
		
		for(int i=0; i<arr.length; i++){
			int  temp = arr[i];
			while(arr[i] > 0){
				rev = rev * 10;
          rev = rev + arr[i] % 10;
          arr[i] = arr[i] / 10;

			}
			 	arr[i] = rev;  
		}
		
		return arr;
			
	}

	public static void main(String[] args) {
		int arr[] = { 23, 34, 45, 56};
		// System.out.println(getSorted(arr));
		int []result = new ReverseArrayNum().getSorted(arr);
		System.out.println("");
		for(int i= 0; i< result.length; i++){
			System.out.println(arr[i]);
		}


		
	}
}