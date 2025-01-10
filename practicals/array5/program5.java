import java.util.*;
class Program5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Size : ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter array elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<size;i++){
			int s=arr[i];
			int cnt=0;
			while(s>0){
				s/=10;
				cnt++;
			}
			System.out.println(arr[i]+":"+cnt);
		}
	}
}
