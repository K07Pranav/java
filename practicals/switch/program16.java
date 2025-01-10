class program16{
	public static void main(String[] args){
		int p=9;
		if(p<=5){
			switch(p){
				case 0: System.out.println("Zero");
					break;

				case 1: System.out.println("One");
					break;
	
				case 2: System.out.println("Two");
					break;
		
				case 3: System.out.println("Three");
					break;

				case 4: System.out.println("Four");
					  break;
		
				case 5: System.out.println("Five");
					 break;
	
				default: System.out.println("Invalid");
			}
		}else{
			System.out.println(p+" is greater than 5");
		}
	}
}

