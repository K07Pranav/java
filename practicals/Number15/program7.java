import java.util.*;
class ReverseDemo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n=sc.nextInt();
		System.out.print("Reverse of "+n+" is ");
		while(n!=0){
			int rev=n%10;
			n=n/10;
			System.out.print(rev);	
		}
		
	}
}
