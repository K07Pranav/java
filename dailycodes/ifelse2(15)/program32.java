class program32{
	public static void main(String [] args){
		char ch1='a';
		char ch='A';
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(i%2==0){
					System.out.print(ch1++ +" ");
				}
				
				if(i%2!=0)
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
	}
}
