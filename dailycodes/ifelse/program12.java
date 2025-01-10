class program12{
	public static void main(String[] args){
		int n=2;
		System.out.println("Before switch");
		switch(n){
			case 1: System.out.println("one");
			case 2: System.out.println("two");
			case 3: System.out.println("three");
			default : System.out.println("in default");
		}
		System.out.println("After switch");
	}
}
