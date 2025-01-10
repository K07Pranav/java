import java.util.*;
class Program4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size : ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			if(arr[i]%2==0){
				arr[i]=0;
			}else{
				arr[i]=1;
			}
		}

		for(int j=0;j<arr.length;j++){
			System.out.println(arr[j]);
		}
	}
}
