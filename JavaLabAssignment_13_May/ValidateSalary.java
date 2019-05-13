class MyException extends Exception {

   MyException(String str){
        super(str);
    }
}
public class ValidateSalary {
   
   public static void main(String args[])  {
   
      
         System.out.println("Enter your salary");
         java.util.Scanner sc = new java.util.Scanner(System.in);
		 int sal = sc.nextInt();
	
		 try
		 {
		 	new ValidateSalary().checkSal(sal);

		 }catch(MyException e)
		 {
		 	System.out.println(e);
		 }
      	 
   }

   public void checkSal(int sal) throws MyException
   {
   		System.out.println("Checking salary");
   		if(sal < 3000)
        	throw new MyException("Salary  is below 3000");
        else
        	System.out.println("Salary  isabove 3000");
   }
}