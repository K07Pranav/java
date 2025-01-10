import java.util.*;
class DuckNum{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num=sc.nextInt();
		int temp=num;
		int temp1=num;
		
		int flag=0;
		int cnt=0;
		int rev=0;
		while(num>0){
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
			cnt++;
		}

		for(int i=1;i<=cnt;i++){
			int rem=rev%10;
			if(i==1){
				if(rem==0){
					break;
				}
			}else{
				if(rem==0){
					flag=1;
					break;
				}
			}
			rev/=10;
			System.out.println(i);
		}

		if(flag==1){
			System.out.println(temp1+" is a Duck Number");
		}else{
			System.out.println(temp1+" is not a Duck Number");
		}
	}
}
