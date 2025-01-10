class program9{
	public static void main(String[] args){
		int num=2469185;
		int sum=0;
		while(num>0){
			int rem=num%10;
			int sqr=0;
			if(rem%2==1)
				sqr=rem*rem;
				sum=sum+sqr;
			num=num/10;
		}
		System.out.print(sum);
	}
}
