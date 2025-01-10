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
		
		int max1=-1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max1)
				max1=arr[i];
		}
		
		int max2=-1;
		for(int i=0;i<size;i++){
			if(arr[i]==max1){
				continue;
			}
			if(arr[i]>max2){
				max2=arr[i];
			}
		}

		System.out.println("Second largest element is : "+max2);
	}
}
