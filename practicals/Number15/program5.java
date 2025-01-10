import java.util.*;
class FactorialDemo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n=sc.nextInt();
		int p=1;

		for(int i=1;i<=n;i++){
			p*=i;
		}
		System.out.println("Factorial of "+n+" is "+p);
		
	}
}
