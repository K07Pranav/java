import java.util.*;
class Program5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size : ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			if(arr[i]<=0){
				arr[i]*=arr[i];
			}else{
				arr[i]=arr[i];
			}
		}
		
		System.out.println("Array elements : ");
		for(int j=0;j<arr.length;j++){
			System.out.println(arr[j]);
		}
	}
}
