class program5{
	public static void main(String[] args){
		int rows=3;
		int n=1;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				System.out.print((char)(n+64)+" ");
				n+=2;
			}
			System.out.println(); 
		}
	}
}
