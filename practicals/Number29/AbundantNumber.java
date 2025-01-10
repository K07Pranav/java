import java.util.*;
class AbundantNum{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num=sc.nextInt();
		int sum=0;
		
		System.out.print("Divisors are : ");
		for(int i=1;i<num;i++){
			if(num%i==0){
				sum+=i;
				System.out.print(" "+i);
			}
		}
		
		System.out.println();
		System.out.println("Sum of Divisor is : "+sum);

		if(sum>num){
			System.out.println(num+" is a Abundant Number");
		}else{
			System.out.println(num+" is not a Abundant Number");
		}
	}
}
