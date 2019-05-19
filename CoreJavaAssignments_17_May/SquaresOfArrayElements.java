import java.util.*;
class SquaresOfArrayElements{
	public static HashMap getSquares(int[] arr){
		HashMap <Integer,Integer> map = new HashMap<>();
		for( int n : arr){
			map.put(n, n*n);
		}
		
			return map;
	}



	public static void main(String[] args) {
		java.util.Scanner  sc = new java.util.Scanner(System.in);
		int []arr = new int[5];
		System.out.println("Enter the five numbers :");
		for(int i =0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		HashMap <Integer, Integer> map = getSquares(arr);
		 Iterator<Integer> it = map.keySet().iterator();
    while(it.hasNext()){
    Integer key = it.next();
      System.out.println(key + " : " + map.get(key));
    }

	
	}
}