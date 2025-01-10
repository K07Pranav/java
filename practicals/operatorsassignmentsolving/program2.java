class program2{
	public static void main(String[] args){
		int num='Z';//86

		if(true){//                  89  +   88  + 87   +  86
			System.out.println(--num + --num + --num + --num);//350
                         num--;//85
		}
		System.out.println(num);//85
		//85<20 false
		if(num<20){//false
			num='A';
		}
		System.out.println(num);//85
	}
}
