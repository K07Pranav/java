class program4{
	public static void main(String[] args){
		char ch=97;//a//99//c
		System.out.println(ch);//a
			
		if(ch=='a'){
			ch+=3;//100//d
			System.out.println(ch--);//100/d
		}
		else
		{
			System.out.println(ch++);
		}
			System.out.println(ch+=5);//h
	}
}
