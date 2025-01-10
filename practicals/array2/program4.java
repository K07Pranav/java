import java.util.*;
class Program4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enetr Size : ");
		int size=sc.nextInt();
	
		int arr[]=new int[size];
	
		System.out.println("Enter Array elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		System.out.print("Even the number to search in array : ");
		int s=sc.nextInt();

		for(int i=0;i<arr.length;i++){
			if(arr[i]==s){
				System.out.print(s+" found at index "+i);
			}
		}
	}
}
