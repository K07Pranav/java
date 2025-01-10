class program8{
	public static void main(String[] args){
		int num1=3;
		int num2=7;
		int p=0;
		if(num1>0 && num2>0){
			p=num1*num2;
			int r=p%2;
			if(r==0){
				System.out.println("Number is even");
			}else{
				System.out.println("Number is odd");
			}
		}else{
			System.out.println("Sorry negative number is not allowed");
		}

	}
}
