import java.util.Scanner;
class ReverseString{
	public static void main(String[] args) {
		String revstr = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to reverse :" );
		String str = sc.nextLine();
		for(int i= str.length()-1; i>=0; i--){
			revstr = revstr+ str.charAt(i);
		}
		System.out.println("After reverse string is " +revstr);
	}
}