import java.util.*;
class Program4{
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
		if(cnt>=2)
		System.out.println(s+" occurs more than 2 times in array");
		else
		System.out.println(s+" not occurs more than 2 times in array");
	}
}
