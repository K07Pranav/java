class program5{
	public static void main(String[] args){
		int rows=4;
		for(int i=1;i<=rows;i++){
			for(int k=1;k<=rows-i;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=rows;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
