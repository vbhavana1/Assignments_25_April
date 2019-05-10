import java.util.Scanner;
class ReplaceRWithT{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String str = sc.nextLine();
		if (str.contains("r")){
			System.out.println(str.replace("r","t"));
		}
		
	}
}