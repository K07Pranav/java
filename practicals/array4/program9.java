import java.util.*;
class Program9{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Size : ");
		int size=sc.nextInt();
		char arr[]=new char[size];
		
		System.out.println("Enter array elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.next().charAt(0);
		}
		
		System.out.println("Array : ");
		for(int i=0;i<arr.length;i++){
			if(arr[i]>=97&&arr[i]<=122){
				System.out.println(arr[i]);
			}else{
				System.out.println("#");
			}
		}
	
	}
}
