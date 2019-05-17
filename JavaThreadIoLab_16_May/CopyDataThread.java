import java.util.*;
import java.io.*;
class CopyDataThread extends Thread{
	public void run(){
		try{
			
			FileReader fr = new FileReader("source.txt");
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter("target.txt", true);
			String str;
			char ch[];
			
			while((str = br.readLine()) != null){

				fw.write(str);
				ch = str.toCharArray();
				for ( int i = 1 ; i< 10; i++){
					fw.write(ch);
				Thread.sleep(2000);
		
			}
		
				fw.flush();
				
				
			}
			
			br.close();
			fw.close();
			System.out.println("file copied");
		}
		catch(IOException e){
			System.out.println(e);
			// e.printStackTrace();

		}
		catch(InterruptedException a){
			System.out.println(a);
		}
		}
	public static void main(String[] args) {
		Thread thread = new CopyDataThread();
		thread.start();


	}
}
