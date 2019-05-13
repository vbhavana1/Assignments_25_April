class MyException extends Exception {

   MyException(String str){
        super(str);
    }
}

public class ValidateNames {
   
   public static void main(String args[])  {
   
      
         
         java.util.Scanner sc = new java.util.Scanner(System.in);
         System.out.println("Enter your firstname ");
		 String fname = sc.nextLine();
		 System.out.println("Enter your lastname");
		 String lname = sc.nextLine();

		 try
		 {
		 	new ValidateNames().checkName(fname,lname);

		 }catch(MyException e)
		 {
		 	System.out.println("Exception caught: "+e);
		 }
      	 
   }

   public void checkName(String fname, String lname) throws MyException
   {
   		System.out.println("Checking name");
   		if(fname.equals("") || lname.equals(""))
        	throw new MyException("First name or last name cannot be empty");
        else
        	System.out.println("Name is valid");
   }
}