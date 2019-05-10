import java.util.Scanner;
class CompareTwoStrings{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input string");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
	int	 result = str1.compareToIgnoreCase(str2);
	if(result == 0){
		System.out.println("entered  String are Same");
	}
	else{
		System.out.println("Entered strings are not same");
	}
	}
}