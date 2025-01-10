import java.util.*;
class PalindromeDemo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num=sc.nextInt();
		int n=num;	
		int rev=0;
		int rem=0;
		while(n!=0){
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		
		if(num==rev){
			System.out.println(num+" is palindrome number");
		}else{
			System.out.println(num+" is not palindrome number");
		}
		
	}
}
