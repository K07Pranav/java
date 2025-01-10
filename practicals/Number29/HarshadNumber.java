import java.util.*;
class HarshadNum{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;

		while(num>0){
			int rem=num%10;
			sum+=rem;
			num/=10;
		}
		if(temp%sum==0){
			System.out.println(temp+" is a Harshad Number");
		}else{
			System.out.println(temp+" is not a Harshad Number");
		}
	}
}
