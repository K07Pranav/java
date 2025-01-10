class Program4{
	public static void main(String[] args){
		char s='A';
		char r='a';
		char p='B';

		int a=65;
		int b=97;
		int c=66;

		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(a));

		System.out.println(System.identityHashCode(r));
		System.out.println(System.identityHashCode(b));

		System.out.println(System.identityHashCode(p));
		System.out.println(System.identityHashCode(c));
	}
}
