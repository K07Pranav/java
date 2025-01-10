import java.util.*;
class Program10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size : ");
		int n=sc.nextInt();
		int arr[]=new int[n];

		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++){
			int pr=1;
			for(int j=1;j<=arr[i];j++){
				pr*=j;
			}
			System.out.print(pr+" ");
		}	
	}
}
