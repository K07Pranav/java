import java.util.*;
class StrongNum{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(num>0){
			int rem=num%10;
			int s=rem;
			int pr=1;
			for(int i=1;i<=s;i++){
				pr*=i;
			}
			sum+=pr;
			num/=10;
		}
		if(sum==temp){
			System.out.println(temp+" is a Strong Number");
		}else{
			System.out.println(temp+" is not a Strong Number");
		}
	}
}
