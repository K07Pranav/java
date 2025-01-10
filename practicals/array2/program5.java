import java.util.*;
class Program5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enetr Size : ");
		
		int size=sc.nextInt();
		int arr[]=new int[size];
		int sum=0;
		System.out.println("Enter Array elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++){
			if(i%2==1){
				sum+=arr[i];
			}
		}
		System.out.println("sum of odd indexed elements : "+sum);
		

	}
}
