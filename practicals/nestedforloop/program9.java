class program9{
	public static void main(String[] args){
		int rows=4;
		char s=(char)(64+rows);
		int n=1;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				System.out.print(s+""+n+" ");
				n++;
			}
			System.out.println(); 
		}
	}
}