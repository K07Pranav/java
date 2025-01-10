class program18{
	public static void main(String[] args){
		int p=-9;
		int s=8;
		if(p>0 && s>0){
			int sum=p*s;
			int r=sum%10;
			switch(r){
				case 2: System.out.println("Even");
					break;

				case 1: System.out.println("Odd");
					break;
			}
		}else{
			System.out.println("Sorry negative numbers not allowed");
		}
	}
}

