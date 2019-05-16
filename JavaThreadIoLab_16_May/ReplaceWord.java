import java.io.*;
class ReplaceWord{
	public static void main(String[] args) {
		try{
			String line ="";
			String newstr = "good";
			String content = "";

			
		
		int count = 0;
		FileReader fr = new FileReader("abcd.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		  while( (line = br.readLine()) != null){
		  	// System.out.println(line);
		  	line = line.replace(newstr,"bad");
		  	System.out.println(line);
		  	content = content + line + "\n";
             // System.out.println(newstr);
            }
            fr.close();
            br.close();
            FileWriter fw = new FileWriter("abcd.txt");
            BufferedWriter wr = new BufferedWriter(fw);
            wr.write(content);
            fw.close();
            wr.close();
            
		
           


		

	}
	catch(IOException e ){
		System.out.println(e);

	}

	}
}