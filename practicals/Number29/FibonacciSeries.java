import java.util.*;
class Fibonacci{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num=sc.nextInt();
		
		int num1=0;
		int num2=1;
		int add=0;
		for(int i=1;i<=10;i++){
			System.out.println(add);
			num1=num2;
			num2=add;
			add=num1+num2;
		}
	}
}
