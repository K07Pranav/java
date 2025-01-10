class program10{
	public static void main(String[] args){
		int num=9367924;
		int sum=0;
		int pr=1;
		while(num>0){
			int rem=num%10;
			if(rem%2==1){
				sum=sum+rem;
			}else{
				pr=pr*rem;
			}
			num=num/10;
		}
		System.out.print("Sum of odd digits "+sum);
		System.out.print("Product of odd digits "+pr);
	}
}
