class program99{
	public static void main(String[] args){
		int rows=4;
		int n=0;
		int s=1;
		for(int i=1;i<=rows;i++){
			n=s;
			for(int j=1;j<=rows;j++){
				System.out.print(n+" ");
				s=n++;
			}
			System.out.println(); 
		}
	}
}
