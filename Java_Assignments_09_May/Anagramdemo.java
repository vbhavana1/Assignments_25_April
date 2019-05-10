import java.util.Arrays;
class Anagramdemo{
	public static void main(String[] args) {
		String str = "parliament";
		String str1 = "partial men";
		char ch1[] = str.toCharArray();
		Arrays.sort(ch1);
		System.out.println(Arrays.toString(ch1));
		char ch2[] = str1.toCharArray();
		Arrays.sort(ch2);
		System.out.println(Arrays.toString(ch2));
		System.out.println(Arrays.equals(ch1,ch2));
		if(ch1.equals(ch2)){
			System.out.println("Given Strings are Anagrams");
		}
		else{
			System.out.println("Given Strings are not anagrams");
		}
	}
}