import java.io.*;
class DisplayCountOfCharLines{
	public static void main(String[] args) {
		try{
			String line ="";
		int	charCount = 0;
		File file = new File("abcd.txt");
		// System.out.println(file.exists());
		file.createNewFile();
		// System.out.println("File created" +file);
		FileReader fr = new FileReader("abcd.txt");
		BufferedReader br = new BufferedReader(fr);
		 // line=  br.readLine();
		 // System.out.println(line);
		int count = 0;
		int countWord = 0;
		  while( (line = br.readLine()) != null){

                
                 if(!(line.equals(""))) 
            {  
                charCount += line.length(); 
                 String[] word = line.split(" "); 
                  
                countWord += word.length; 
            }
        }
        System.out.println("No of Character in the file is "+ charCount);
        System.out.println("No of words in the file" + countWord);

	}
	catch(IOException e ){
		System.out.println(e);

	}

	}
}