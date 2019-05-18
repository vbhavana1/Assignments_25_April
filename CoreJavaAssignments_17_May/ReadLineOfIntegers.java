import java.util.*;
import java.io.*;
class ReadLineOfIntegers
{
public static void main(String[] args) {
	 int num;
	Integer sum = 0;
	StringTokenizer str = new StringTokenizer("11 22 33 44 55");
	 
        while (str.hasMoreTokens()) {
            //System.out.println(str.nextToken()); 
        
       String str1 = str.nextToken();
            num =Integer.parseInt(str1);
            System.out.println(num);
            sum = sum + num;
        }
        System.out.println("The sum of all intergers in a line " +sum);
    
   
    
   
}

}
