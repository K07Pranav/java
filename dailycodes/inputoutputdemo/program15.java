class program15{
	int x=10;
	static int y=20;

	void fun(){
		System.out.println("In fun");
	}

	static void run(){
		System.out.println("In run");
	}
	
	public static void main(String[] args){
		program15 obj=new program15();
		System.out.println(x);
		System.out.println(obj.y);
		obj.fun();
		run();
	}
}
