import java.util.*;
class Program9{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n=sc.nextInt();
		
		int cnt=0;
		int rev=0;
		while(n>0){
			int rem=n%10;
			rev=rev*10+rem;
			cnt++;
			n/=10;
		}
		System.out.println(rev);
		int arr[]=new int[cnt];
		int s=0;
		while(rev>0){
			int rem=rev%10;
			arr[s]=rem+1;
			rev/=10;
			s++;
		}

		for(int i=0;i<cnt;i++){
			System.out.print(arr[i]);
		}

		
		
	
	}
}
