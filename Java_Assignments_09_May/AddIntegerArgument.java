class AddIntegerArgument{
	public static void main(String[] args) {

		int newarr= 0;
		// if(args.length()>0){
			for(int i =0; i<args.length; i++){
				 newarr += Integer.parseInt(args[i]);  


			}
			System.out.println(newarr);
			
		// }
	}
}