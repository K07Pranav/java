import java.util.*;
class Program9{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();

		for(int i=1;i<=rows;i++){
			int num=1;			
			for(int k=2;k<=i;k++){
				System.out.print("\t");
			}
			for(int j=rows;j>=i;j--){
				System.out.print(num++ +"\t");
			}
			System.out.println();
		}
	}
}
