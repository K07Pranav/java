class program13{
	public static void main(String[] args){
		int n=2;
		System.out.println("Before switch");
		switch(n){
			case 1: System.out.println("one");
				break;

			case 2: System.out.println("two");
				break;

			case 3: System.out.println("three");
				break;

			default : System.out.println("in default");
		}
		System.out.println("After switch");
	}
}
