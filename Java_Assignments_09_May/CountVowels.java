import java.util.Scanner;
class CountVowels{
	public static void main(String[] args) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to count vowels in string");
		String str = sc.nextLine();
		for(int i =0; i< str.length(); i++){
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
				count ++;
			}
			
		}
		System.out.println("count of vowels" +count);
	}
}