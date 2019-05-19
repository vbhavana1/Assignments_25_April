import java.util.*;
class CountCharsInArray{

	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		 char ch[] = str.toCharArray();
		 HashMap <Character, Integer> map = countCharacter(ch);
		  Iterator<Character> it = map.keySet().iterator();
    while(it.hasNext()){
    Character key = it.next();
      System.out.println(key + " : " + map.get(key));
    }
		
	}

	public static HashMap countCharacter(char ch[]){

		HashMap <Character, Integer> map = new HashMap<>();
		for(char ch1:ch)
    {

        if(map.containsKey(ch1))
        {
            map.put(ch1,map.get(ch1)+1);
        }
        else
        {
            map.put(ch1,1);
        }
    }
		
		return map;

	}






}