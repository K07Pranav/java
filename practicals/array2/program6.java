import java.util.*;
class Program6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enetr Size : ");
		
		int size=sc.nextInt();
		int arr[]=new int[size];
		int product=1;
		System.out.println("Enter Array elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++){
			if(i%2==1){
				product*=arr[i];
			}
		}
		System.out.println("sum of odd indexed elements : "+product);
		

	}
}
