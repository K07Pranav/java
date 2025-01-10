import java.util.Scanner;
class Program9{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Array Size : ");
		int size=sc.nextInt();
		int sum=0;

		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++){
			System.out.print("Enter Element : ");
			arr[i]=sc.nextInt();
		}
	
		System.out.println("Array Length : "+arr.length);

		for(int i=0;i<arr.length;i++){
			System.out.println(" "+arr[i]);
		}
		
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		System.out.println("Sum : "+sum);
	}
}
