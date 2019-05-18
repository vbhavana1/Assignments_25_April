class SumOfCubes{

	public static int sumnum(int num) 
    { 
    	int sum = 0;
        while(num!=0)
		{
		int d = num % 10;
		sum  = sum + d * d * d;
		num = num / 10;
		}
		 return sum;

    } 


	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the number to get sum of their cubes");
		int num = sc.nextInt();
        System.out.println("The cube of Digits :" +sumnum(num)); 

		
	}
}