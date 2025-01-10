import java.util.*;
class Program10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enetr Size : ");
		
		int size=sc.nextInt();
		int arr[]=new int[size];
	
		System.out.println("Enter Array elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		int max=arr[0];
		int pos=0;
	
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
				pos=i;
			}
		}
		System.out.println("Maximum number in the array is : "+max+" at Index "+pos);
	}
}
