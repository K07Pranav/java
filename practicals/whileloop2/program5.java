class program5{
	public static void main(String[] args){
		int num=216985;
		while(num>0){
			int rem=num%10;
			if(rem%2==0){
				System.out.print(rem*rem*rem+" ");
			}
			num=num/10;
		}
	}
}
