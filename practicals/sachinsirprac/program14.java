class program14{
	public static void main(String[] args){
		int n=1;
		char c='A';
		for(int i=1;i<=4;i++){
			if(i%2==1){
				for(int j=1;j<=3;j++){
					System.out.print(n+" ");
					n++;
					c++;
				}
			}else{
				for(int j=1;j<=3;j++){
					System.out.print(c+" ");
					n++;
					c++;
				} 
			}
			System.out.println();
		}
	}
}
