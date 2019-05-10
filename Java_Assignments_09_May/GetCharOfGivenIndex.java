import java.util.Scanner;
class  GetCharOfGivenIndex{
	public static void main(String[] args) {
		String str = new String("Bhavana");
		System.out.println(str);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Index num to get char at Specified index");
		int num = sc.nextInt();
		char ch[] = str.toCharArray();
					if(str.length() > num)
					{
				System.out.println(ch[num]);
			}
			else{
		System.out.println("Specify the correct index");
	}
	}
}