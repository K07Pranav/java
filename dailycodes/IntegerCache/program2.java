class Program2{
	public static void main(String[] args){
		int s=10;
		int r=10;
		int p=10;

		int a=20;
		int b=20;
		int c=20;

		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(r));
		System.out.println(System.identityHashCode(p));
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(c));
	}
}
