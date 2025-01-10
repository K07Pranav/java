import java.util.*;
class Program3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size : ");
		int size=sc.nextInt();
		
		int arr[]=new int[size];

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Even Array Elements are : ");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0)
			System.out.println(arr[i]);
		}

	}
}
