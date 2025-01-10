class program19{
	public static void main(String[] args){
		char n='B';
		System.out.println("Before switch");
		switch(n){
			case 'B': System.out.println("b");
				break;

			case 66: System.out.println("b");
				break;

			case 'A': System.out.println("a");
				break;
			
			case 65: System.out.println("a");

			default : System.out.println("in default");
		}
		System.out.println("After switch");
	}
}
