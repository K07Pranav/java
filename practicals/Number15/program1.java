import java.util.*;
class FactorsDemo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n=sc.nextInt();
		
		System.out.print("Factors of "+n+" are ");
		for(int i=1;i<=n-1;i++){
			if(n%i==0){
				System.out.print(i+", ");
			}
		}
		System.out.print(n);
	}
}