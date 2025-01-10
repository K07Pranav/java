class program1{
	public static void main(String[] args){
		int num=0;//4
		if(true){//                0     +   2   + 3     +  4
			System.out.println(num++ + ++num + ++num + ++num);//9
		}
		System.out.println(num-10);//4-10=-6
		if(num>0){ //4>0
			num=10;
		}
		System.out.println(num);//10
	}
}
