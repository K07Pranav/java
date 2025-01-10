class program11{
	public static void main(String[] args){
		int num=28;
		int p=num%2;

		switch(p){
			case 1: System.out.println("Number is Odd");
				break;

			case 0: System.out.println("Number is Even");
				break;

			default: System.out.println("Invalid");
		}
	}
}
