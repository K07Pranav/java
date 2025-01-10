class program5{
	public static void main(String[] args){
		char ch= 97; //a
		System.out.println(ch=ch+8);//possible loosy conversion from int to char

		if(ch=='a'){
			int x=5;
			System.out.println(ch-- +x);
		}
		else{
			int x=7;
			System.out.println(ch++);
			System.out.println(x);
		}
			System.out.println(ch+=5);

	}
}
