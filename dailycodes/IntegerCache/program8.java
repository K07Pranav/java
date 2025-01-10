class Program8{
	public static void main(String[] args){
		int s=28;	
		int p=28;

		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(p));

		p=01;
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(p));
	}
}
