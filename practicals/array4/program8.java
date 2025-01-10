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
		
		System.out.print("Enter the number to check : ");
		int s=sc.nextInt();
		int cnt=0;
		for(int i=0;i<arr.length;i++){
			if(s==arr[i]){
				cnt++;
			}
		}
		System.out.println(s+" occurs "+cnt+" times in array");
	}
}
