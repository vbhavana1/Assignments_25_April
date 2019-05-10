import java.util.Scanner;
class CheckPalindrome{
	public static void main(String[] args) {
		 String str1 = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the input to CheckPalindrome");
		String str = scan.nextLine();
		//System.out.println("The input String is" +scan.nextLine());
 			int length = str.length();
		for (int i= length-1; i>=0; i--){
			str1 = str1 + str.charAt(i);
		}
		if(str.equals(str1)){
			System.out.println("The input String is palindrome");
		}
		else{
		System.out.println("The input string is not a palindrome");
	}
	}
}