class ifelsedemo{
	public static void main(String[] args){
		int num='Z'+32;//90+32=122/61/31
		System.out.println(num);//122
		// 122>90
		if(num > 'Z'){
			num/=2;//61
			num-=30;//31
			System.out.println(~num);//-32
		}
	}
}
