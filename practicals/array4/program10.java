import java.util.*;
class Program10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Size : ");
		int size=sc.nextInt();
		char arr[]=new char[size];
		
		System.out.println("Enter array elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.next().charAt(0);
		}
		
		System.out.print("Enter character key : ");
		int s=sc.next().charAt(0);
		
		System.out.println("Array : ");
		for(int i=0;i<arr.length;i++){
			if(s==arr[i]){
				break;
			}
			System.out.println(arr[i]);
		}
	}
}
