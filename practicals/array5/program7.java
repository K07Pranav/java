import java.util.*;
class Program7{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Size : ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter array elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Composite numbers are : ");
		for(int i=0;i<size;i++){
			int s=arr[i];
			int cnt=0;
			int flag=0;
		
			for(int j=1;j<=s;j++){
				if(s%j==0)
					cnt++;
			}
			if(cnt>2){
				System.out.println(s);
			}
		}
	}
}
