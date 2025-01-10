import java.util.*;
class Program2{
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
		System.out.print("Elements divisible by 3 : ");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%3==0){
				System.out.print(arr[i]+" ");
				sum+=arr[i];
			}
		}
		System.out.println("sum of elements divisible by 3 is : "+sum);
		

	}
}
