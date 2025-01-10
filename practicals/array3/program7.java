import java.util.*;
class Program7{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size : ");
		int size=sc.nextInt();

		int arr[]=new int[size];

		System.out.print("Enter array elements :  ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter array elements : ");
		for(int j=0;j<arr.length;j++){
			if(size%2==1 && size>=5){
				if(arr[j]%2==1){
					System.out.println(arr[j]+"\t");
				}	
			}else{
				if(arr[j]%2==0){
					System.out.println(arr[j]+"\t");
				}
			}	
		}
	}
}
