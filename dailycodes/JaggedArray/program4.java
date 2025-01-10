import java.util.*;
class Program4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of rows : ");
		int rows=sc.nextInt();
		System.out.println("Enter no. of columns : ");
		int cols=sc.nextInt();

		int arr[][]=new int[rows][cols];
		System.out.println("Enter elements : ");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=sc.nextInt();
			}
		}

		System.out.println("Array elements are : ");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println(arr[1][1]);
		System.out.println(arr[1]);
		System.out.println(arr);
	}
}
