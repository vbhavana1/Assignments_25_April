class FindNonRepeating
{
	public static void main(String[] args) {
		java.util.Scanner  a= new java.util.Scanner(System.in);
		System.out.println("Enter input string");
		String str = a.nextLine();
	
		for(Character ch:str.toCharArray()) {
			// System.out.println(str.indexOf(ch));
			// System.out.println(str.lastIndexOf(ch));
            if(str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println("First non repeat character = " + ch);
                break;
            }
        }
    }
}