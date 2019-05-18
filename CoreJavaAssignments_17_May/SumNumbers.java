class SumNumbers{
	public static int caluclateSum(int n){
		int sum = 0;
		for(int i= 0; i < n; i++){
			if( i % 3 == 0 && i % 5 == 0){
			 sum = sum + i;
			}

		}
		
		return sum;
	}


	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		new SumNumbers().caluclateSum(n);
		System.out.println("Sum of Number is" +caluclateSum(n));
		
	}
}