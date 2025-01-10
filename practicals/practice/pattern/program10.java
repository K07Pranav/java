class program10{
	public static void main(String[] s){
		int rows=5;
		int n=1;
		int a=2;
		for(int i=rows;i>=1;i--){
			for(int k=1;k<=rows-i;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){	
				System.out.print("*");
			}
			for(int p=2;p<=i;p++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
