class program10{
	public static void main(String[] args){
		int rows=4;
		int n=0;
		for(int i=1;i<=rows;i++){
			n=i;
			for(int j=1;j<=rows;j++){
				System.out.print(n+" ");
				n++;
			}
			System.out.println(); 
		}
	}
}
