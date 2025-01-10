import java.util.*;
class Program1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Array size : ");
		int size=sc.nextInt();

		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}

		for(int j=0;j<size;j++){
			System.out.println("Array Elements : "+arr[j]);
		}
	}
}
