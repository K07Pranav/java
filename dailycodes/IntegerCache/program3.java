class Program3{
	public static void main(String[] args){
		int s=100;
		int r=110;
		int p=100;

		int a=128;
		int b=128;

		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(r));
		System.out.println(System.identityHashCode(p));
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
	}
}
