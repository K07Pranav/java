class program9{
	public static void main(String[] args){
		System.out.println("In main method");
		program9 obj=new program9();
		obj.run();
		obj.fun();
		obj.gun();
	}

	void fun(){
		System.out.println("In Fun function");
	}

	void run(){
		System.out.println("In run function");
	}

	void gun(){
		System.out.println("In gun function");
	}
}
