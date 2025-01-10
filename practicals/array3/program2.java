import java.util.*;
class Program2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size : ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		System.out.println("Enter the Element to know the occurence in array : ");
		int s=sc.nextInt();
		int flag=0;

		for(int j=0;j<arr.length;j++){
			if(arr[j]==s){
				flag=j;
				break;	
			}
		}

		if(flag!=0){
			System.out.println("Number "+s+" first occured at index : "+flag);
		}else{
			System.out.println("Number "+s+" not found in array");
		}
	}
}
