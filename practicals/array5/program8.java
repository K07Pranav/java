import java.util.*;
class Program8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Size : ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter array elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		int min1=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min1){
				min1=arr[i];
			}
		}
		
		int min2=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]==min1)
				continue;
			if(arr[i]<min2){
				min2=arr[i];
			}
		}

		System.out.println("Second Minimum : "+min2);
	}
}
