class Program2{
	public static void main(String[] args){
		int x=10;
		float y=x;
		
		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
	}
}
