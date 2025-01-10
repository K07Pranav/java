class postincree{
	public static void main(String[] args){
		int x=14;//20
		int y=22;//25

		System.out.println(++x + y++);
		//15 +22=37
	
		System.out.println(x++ + ++y + ++x + ++x);
		//15+24+17+18=74
		
		System.out.println(y++ + ++x + ++x);
		//24+19+20=63

	}
}
