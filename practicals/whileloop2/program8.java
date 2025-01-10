class program8{
	public static void main(String[] args){
		int num=256985;
		int pr=1;
		while(num>0){
			int rem=num%10;
			if(rem%2==1)
				pr=pr*rem;
			num=num/10;
		}
		System.out.print(pr);
	}
}
