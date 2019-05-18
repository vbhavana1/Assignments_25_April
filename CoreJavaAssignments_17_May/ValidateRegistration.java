class ValidateRegistration{

public static boolean checkvalidation(String str){


		if(str.endsWith("_job")){
			int i = str.indexOf("_job");
			
			if(i >0)
			{
				String str1 = str.substring(0,i);
				if(str1.length() >= 8)
				{
					return true;
				}
			}

		}
	return false;

}

public static void main(String[] args) {
		 java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter String  : ");
        String str = sc.nextLine();
       if (new ValidateRegistration().checkvalidation(str)) { 
            System.out.println("true"); 
        } else { 
            System.out.println("false"); 
        } 
	}
}