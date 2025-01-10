class program9{
	public static void main(String[] args){
		int num=214367689;
		int cnte=0;
		int cnto=0;
		while(num>0){
			int rem=num%10;
			num=num/10;
			if(rem%2==1){
				cnto++;
			}else{
				cnte++;
			}
		}
		System.out.println("Even Count : "+cnte);
		System.out.println("Odd Count : "+cnto);
	}
}
