class program7{
	public static void main(String[] args){
		System.out.println("In main method");
		program7 obj=new program7();
		obj.run();
		obj.fun();
	}

	void fun(){
		System.out.println("In Fun function");
	}

	static void run(){
		System.out.println("In run function");
	}
}
