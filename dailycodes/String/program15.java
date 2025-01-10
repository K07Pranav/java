class Program15{
	public static void main(String[] args){
		String str1="sid";
		System.out.println(System.identityHashCode(str1));

		String str2="naik sid";
		System.out.println(System.identityHashCode(str2));

		String str3=new String("sid");
		System.out.println(System.identityHashCode(str3));
		
		String str4=new String("sid");
		System.out.println(System.identityHashCode(str4));
	}
}
