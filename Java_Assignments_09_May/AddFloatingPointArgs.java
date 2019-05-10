class AddFloatingPointArgs{
	public static void main(String[] args) {
			float sum = 0;
			for( int i = 0; i<args.length; i++){
				float f = Float.parseFloat(args[i]);
				 sum = sum + f;
		 // System.out.println(sum);
			}
			if(args.length > 1){
				System.out.println(sum);
			}else{
				System.out.printf("%.2f", sum);
			}
		
	}
}