class program9{
	public static void main(String[] s){
		int rows=5;
		for(int i=1;i<=rows;i++){
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
