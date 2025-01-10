import java.util.*;
class Program8{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();

		int num=rows;
		for(int i=1;i<=rows;i++){
			
			for(int k=2;k<=i;k++){
				System.out.print("\t");
			}
			for(int j=rows;j>=i;j--){
				System.out.print(num+"\t");
			}
			num--;
			System.out.println();
		}
	}
}
