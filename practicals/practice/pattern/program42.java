import java.util.*;
class Program42{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();
		System.out.println();

		for(int i=1;i<=rows;i++){
			int n=1;
			for(int j=rows;j>=i;j--){
				System.out.print(n+++" ");
			}
			System.out.println();
		}
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i+1;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
