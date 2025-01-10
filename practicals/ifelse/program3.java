class evenoddgreater{
	public static void main(String[] args){
		int num=10;
	
		if((num%2!=0)&&(num>10)){
			System.out.println(num+" is an odd number and greater than 10");
		}
		else if((num%2==0)&&(num<10)){
			System.out.println(num+" is an even number and less than 10");
		}
		else  if((num%2==0)&&(num==10)){
			System.out.println(num+" is an even number and equal to 10");
		}
		else
		{
			System.out.println("Invalid");
		}
	}
}
