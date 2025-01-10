import java.util.*;
class Program2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Size : ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter array elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		int esum=0,osum=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				esum+=arr[i];	
			}else{
				osum+=arr[i];
			}
		}
		System.out.println("Odd Sum : "+osum);
		System.out.println("Even Sum : "+esum);
		
	}
}
