import java.util.*;
class Atomorphic{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number : ");
		long n=sc.nextInt();
		long temp=n;
		long cnt=0;

		while(n>0){
			n/=10;
			cnt++;
		}

		long sq=temp*temp;
		long temp1=sq;
		long rev=0;
		for(int i=1;i<=cnt;i++){
			long rem=sq%10;
			rev=rev*10+rem;
			sq/=10;
		}

		long num=0;
		while(rev>0){
			long rem=rev%10;
			num=num*10+rem;
			rev/=10;
		}
		if(num==temp){
			System.out.println("Number is Atmorphic!");
		}else{
			System.out.println("Number is not Atmorphic!");
		}
	}
}
