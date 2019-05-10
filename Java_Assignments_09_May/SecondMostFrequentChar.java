class SecondMostFrequentChar
{
	public static void main(String[] args) {
		String str = "himajaaiaiji";
		
		for(Character ch:str.toCharArray()){
            if(str.indexOf(ch) != str.lastIndexOf(ch)) {
                System.out.println("Most Frequent Character  = " + ch);
                break;
            }
        }
    }
}