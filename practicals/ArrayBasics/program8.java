import java.util.*;
class Program8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of employees : ");
		int size=sc.nextInt();
	
		int arr[]=new int[size];

		System.out.println("Enter Ages of Employee : ");
		for(int i=0;i<arr.length;i++){

			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.println(i+1+" Employee age is "+arr[i]);
		}

	}
}
