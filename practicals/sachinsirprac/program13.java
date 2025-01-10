class program13{
	public static void main(String[] args){
		int rows=3;
		int num=1;
		char c='A';
		for(int i=1;i<=rows;i++){
			if(i%2==1){
				for(int j=1;j<=rows;j++){
					if(j%2==1)
					System.out.print(num +" ");
					else
					System.out.print(c+" ");
					num++;
					c++;
				}
			}else{	
				for(int j=1;j<=rows;j++){
					if(j%2==1)
					System.out.print(c +" ");
					else
					System.out.print(num+" ");
					num++;
					c++;
				}
			}
			System.out.println();
		}
	}
}
