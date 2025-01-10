class program6{
	public static void main(String[] args){
		int num=234;
		int pr=1;
		while(num>0){
			int rem=num%10;
			pr=pr*rem;
			num=num/10;
		}
		System.out.print(pr);
	}
}
