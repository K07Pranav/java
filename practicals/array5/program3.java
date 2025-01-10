import java.util.*;
class Program3{
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
		for(int i=0;i<arr.length/2;i++){
			if(arr[i]!=arr[size-1-i]){
				flag=1;
				break;
			}
		}
		if(flag==0)
			System.out.println("The given array is plaindrome");
		else
			System.out.println("The given array is not plaindrome");
		
	}
}
