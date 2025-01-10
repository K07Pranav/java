import java.util.*;
class HappyNum{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num=sc.nextInt();
		int temp=num;
		int sq=0;
		int sum=0;
		int flag=0;

		while(sum!=4){
			sum=0;
			while(num>0){
				int rem=num%10;
				sq=rem*rem;
				sum+=sq;
				num/=10;
			}
			num=sum;
			if(sum==1){
				flag=1;
				break;
			}
		}

		if(flag==1){
			System.out.println(temp+" is Happy Number");
		}else{
			System.out.println(temp+" is not Happy Number");
		}
	}
}
