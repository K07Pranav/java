class increment{
	public static void main(String[] args){
		int x=19;

		System.out.println(x+++x++);//19+20=39 x=21
		System.out.println(++x + x++ + ++x);//22 + 22 + 24 =68
	}
}
