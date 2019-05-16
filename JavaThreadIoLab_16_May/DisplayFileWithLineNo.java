import java.io.*;
class DisplayFileWithLineNo{
	public static void main(String[] args) {
		try{
			String line ="";
		
		int count = 0;
		FileReader fr = new FileReader("abcd.txt");
		BufferedReader br = new BufferedReader(fr);
		
		
		  while( (line = br.readLine()) != null){

               count++;
               System.out.println(count + line);
            }


	}
	catch(IOException e ){
		System.out.println(e);

	}

	}
}