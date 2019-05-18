class CheckNumber{

public static boolean checkNumber( int number){
	String str = String.valueOf(number);

	char []ch = str.toCharArray();
	for( int i = 0; i< ch.length; i++){
		if(ch[i] < ch[i+1]){
			return true;
		}else{
			return false;
		}

	}

	return true;
}

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		new CheckNumber().checkNumber(number);
		if(checkNumber(number)){
			System.out.println("The number is said to be an increasing number");
		}else{
			System.out.println("The number is not an  increasing number");
		}
		
	}
}