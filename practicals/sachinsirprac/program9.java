class program9{
	public static void main(String[] args){
		for(int i=1;i<=10;i++){
			if(i%2==1)
				System.out.print((char)(i+64)+" ");
			else
				System.out.print((char)(i+96)+" ");
		}
	}
}
