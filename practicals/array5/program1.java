import java.util.*;
class Program1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Size : ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter array elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		int flag=0;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1]){
				flag=1;
				break;	
			}
		}
		if(flag==0)
		System.out.println("The given array is in ascending order");
		else
		System.out.println("The given array is not in ascending order");
	}
}
