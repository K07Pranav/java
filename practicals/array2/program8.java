import java.util.*;
class Program8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enetr Size : ");
		
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter Array elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println();
		for(int i=0;i<arr.length;i++){
			if(arr[i]>5 && arr[i]<9){
				System.out.println(arr[i]+" is greater than 5 but less than 9");
			}
		}
	}
}
