class program8{
	public static void main(String[] args){
		int rows=4;
		for(int i=1;i<=rows;i++){
			char d=(char)(96+rows);
			for(int j=1;j<=rows;j++){
				System.out.print(d+" ");
				d--;
			}
			System.out.println(); 
		}
	}
}
