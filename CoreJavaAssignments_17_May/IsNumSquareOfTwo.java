class IsNumSquareOfTwo{
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the Number ");
		int num = sc.nextInt();
		new IsNumSquareOfTwo().checkNumber(num);
		if(checkNumber(num)){
			System.out.println("Number is Square of 2");
		}
		else{
			System.out.println("Not a square of 2");
		}
		
	}

public static boolean checkNumber(int num){
	 if (num % 2 != 0) {
      return false;
    } 
    else 
    {

      for (int i = 0; i <= num; i++) {

        if (Math.pow(2, i) == num) 
        	return true;
      }
    }
    return false;

}



}