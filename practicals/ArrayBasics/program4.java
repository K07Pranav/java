import java.util.*;
class Program4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size : ");
		int size=sc.nextInt();
		int sum=0;	
		int arr[]=new int[size];

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==1)
			sum+=arr[i];
	
		}
		System.out.println("Sum : "+sum);

	}
}
