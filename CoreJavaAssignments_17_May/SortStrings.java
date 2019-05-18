import java.util.Arrays;
class SortStrings{
	
	public static void main(String[] args) {
		String str[] = new String[20];
		java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter String  : ");
        String str1 = sc.nextLine();
      str  = str1.split("\\s");
          Arrays.sort(str);
          int len = str.length;
          if(len%2 == 0){
          	for(int i =0; i<len/2 ; i++){
          		
          		System.out.println(str[i].toUpperCase());
          	}
          	for(int i = 0; i<len/2 ; i++)
          		System.out.println(str[i].toLowerCase());
          }
          else{
          	for(int i= 0; i<len/2+1; i++){
          		System.out.println(str[i].toUpperCase());
          	}
          	for(int i = 0; i<len/2+1; i++){
          		System.out.println(str[i].toLowerCase());
          	}
          }

        

      
		
	}
}