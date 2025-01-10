class unaryoperator{
	public static void main(String[] args){
		int p=1;
		int s=3;

		System.out.println(++s);//4
		System.out.println(s);//4
		System.out.println(--p);//0
		System.out.println(p);//0
		System.out.println(s++);//4
		System.out.println(s);//5
		System.out.println(p++);//0
		System.out.println(p);//1
		System.out.println(-p);//-1
		System.out.println(-s);//-5
	}
}
