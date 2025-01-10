class Program10{
	public static void main(String[] args){
		char ch='A';
		int ch2=65;

		if(System.identityHashCode(ch)==System.identityHashCode(ch2)){
			System.out.println("Same");
		}else{
			System.out.println("Different");
		}
	}
}
