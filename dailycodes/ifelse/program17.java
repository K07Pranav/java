class program17{
	public static void main(String[] args){
		float n=1.5f;
		System.out.println("Before switch");
		switch(n){
			case 1.5: System.out.println("one");
				break;

			case 2.5: System.out.println("two");
				break;

			case 3.5: System.out.println("three");
				break;

			default : System.out.println("in default");
		}
		System.out.println("After switch");
	}
}
