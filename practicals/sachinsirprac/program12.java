class program12{
	public static void main(String[] args){
		int rows=3;
		int num=9;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				System.out.print(num-- +" ");
			}
			System.out.println();
		}
	}
}
