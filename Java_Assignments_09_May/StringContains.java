class StringContains{
	public static void main(String[] args) {
		java.util.Scanner  a = new java.util.Scanner(System.in);
		System.out.println("Enter the String:");
		String str = a.nextLine();
		if(str.contains("av")){
			System.out.println("char is present in a given string");
		}
		else{
		System.out.println("char is not present in a given string");
	}
	}
}