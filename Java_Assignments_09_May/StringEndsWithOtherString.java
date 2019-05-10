class StringEndsWithOtherString{
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter two strings");
		String firststr = sc.nextLine();
		String secondstr = sc.nextLine();
		if(firststr.endsWith(secondstr))
			System.out.println(" Second string ends with First String");
		System.out.println("Second string dosn't end with first String");
	}
}