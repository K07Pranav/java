import java.util.*;
class Program10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		long num=sc.nextInt();
		long rev;		
		while(num!=0){
			rev=num%10;	
			if(rev%2==1){
				System.out.print(rev*rev+" ");
			}
			num=num/10;
		}
	}
}
