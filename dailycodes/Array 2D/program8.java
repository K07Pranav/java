import java.util.Scanner;
class Program8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Array Size : ");
		int size=sc.nextInt();

		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			System.out.print("Enter Element : ");
			arr[i]=sc.nextInt();
		}
	
		System.out.println("Array Length : "+arr.length);

		for(int i=0;i<arr.length;i++){
			System.out.println(" "+arr[i]);
		}
	}
}
