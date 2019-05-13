class Trafficlights{
  public void showlights(){
  	System.out.println("Red");
  	System.out.println("Yellow");
  	System.out.println("green");

 }
 public void userinput(){
 	java.util.Scanner sc  = new java.util.Scanner(System.in);
 	System.out.println("Enter color to display :");
 	String uinput = sc.nextLine();
 	if(uinput.contains("red")){
 		System.out.println("STOP");
 	}
 	else if(uinput.contains("green")){
 		System.out.println("GO");
 	}
 	else{
 		System.out.println("ready");
 	}
 	
 }
 // public void display(){
 // 	if (uinput.contains("red")){
 // 		System.out.println("STOP");
 // 	}

 // }

}

class mymain{
	public static void main(String[] args) {
		Trafficlights tl = new Trafficlights();
		tl.showlights();
		tl.userinput();
		 // tl.display();
	}
}