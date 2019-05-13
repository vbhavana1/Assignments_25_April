
class MySplit{
	public static void main(String[] args) 
	{
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		System.out.println("Enter a delimiter:");
		String c = sc.nextLine();
		SplitString obj = new SplitString();
		obj.mySplit(str,c);
	}
}

class SplitString{
	void mySplit(String s, String delim)
	{		
		int len = s.length();
		String []arr = new String[len];
		int index;
		int d = delim.length();
		for(int i=0; i<len; i++)
		{
			 
				
				index = s.indexOf(delim);
				System.out.println(index);
				if (index!=-1) {
					
				arr[i] = s.substring(0,index);

				System.out.println(arr[i]);
				s = s.replaceFirst(s.substring(0,index+d),"");
				System.out.println(s);
			}
			else
			{
				arr[i] = s;
				break;
			}
		}
		System.out.println("Splited array: ");

		for (int i = 0; i<len ;i++) 
		{
		if(arr[i]!=null)	
		System.out.println(arr[i]);
		}
	}
}