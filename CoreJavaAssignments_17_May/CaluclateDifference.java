class CaluclateDifference{

public static int caluclateDiffrence( int n){
	
	int sum = 0, a= 0, b=0, c=0;
	for (int i = 1; i <= n ; i++ ) {
		
		a = a+i;
		b = a * a;
		c = c + (i * i);
		sum = b - c;
		
	}
	

	return sum;

}

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		new CaluclateDifference().caluclateDiffrence(n);
		System.out.println("Difference of squares of number and sum of squares is" + caluclateDiffrence(n));
		
	}
}