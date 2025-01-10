class program8{
	public static void main(String[] args){
		int num=216985;
		while(num>0){
			int rem=num%10;
			num=num/10;
			if(rem%2==1){
				System.out.print(rem+" ");
			} 
		}
	}
}
