import java.util.Scanner;
 
class MyException extends Exception {
 
 public MyException(String str) {
  System.out.println(str);
 }
}
public class ValidateAge {
 
 public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  System.out.print("Enter ur age :: ");
  int age = s.nextInt();
  
  try {
   if(age < 15) 
    throw new MyException("Invalid age");
   else
    System.out.println("Valid age");
  }
  catch (MyException a) {
   System.out.println("Enter the age above 15");
  }
 }
}