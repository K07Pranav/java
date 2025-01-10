import java.util.*;
class PerfectNum{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int temp=num;
		
		int sum=0;
		for(int i=1;i<num;i++){
			if(num%i==0){
				sum+=i;
			}
		}

		if(sum==temp){
			System.out.println(temp+" is a Perfect Number");
		}else{
			System.out.println(temp+" is not a Perfect Number");
		}

	}
}
