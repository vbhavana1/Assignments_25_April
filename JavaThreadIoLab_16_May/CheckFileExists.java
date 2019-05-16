import java.io.*;
class CheckFileExists{
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the file name: ");
		String checkfile = sc.nextLine();
		File file = new File(checkfile);
		if(file.exists()){
			System.out.println("File exist");
			System.out.println("File can be writeable" + file.canWrite());
			System.out.println("Length of file is " +file.length());
			String name = file.getName();
			int endwith = name.indexOf(".");
			System.out.println("The extension of file name is  " + name.substring(endwith+1));

		}else {
			System.out.println("File Not Found");
		}
		if(file.canRead()){
			System.out.println(file.getPath());
		}
	}
}