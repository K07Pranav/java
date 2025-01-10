class program8{
	public static void main(String[] args){
		int rows=4;
		for(int i=1;i<=rows;i++){
			for(int k=1;k<=rows-i;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			for(int s=2;s<=i;s++){
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
			for(int s=2;s<=i;s++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
