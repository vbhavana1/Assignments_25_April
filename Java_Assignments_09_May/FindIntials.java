import java.util.Scanner;
class FindIntials{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to find Intials");
		String str = sc.nextLine();
		 String[]  newstr = str.split(" ");
		for(int i=0; i<newstr.length; i++){
		
			
				 char ch[] = newstr[i].toCharArray(); 
				 System.out.println(ch[0]);
				  // if(ch[0] >='A' && ch[0]<='Z' ){
				  // 	System.out.println(newstr[i]);
				  // }
				 // 	System.out.println();
				 // 	System.out.println(newstr);
				 // }
		}
	}

}