import java.util.*;
class Program8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size : ");
		int size=sc.nextInt();

		int arr[]=new int[size];

		System.out.print("Enter array elements :  ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Composite elements are : ");
		for(int j=0;j<arr.length;j++){
			int cnt=0;
			for(int s=1;s<=arr[j];s++){
				if(arr[j]%s==0){
					cnt++;
				}
			}
			if(cnt>2){
				System.out.print(arr[j]+"\t");
			}
		}
	}
}
