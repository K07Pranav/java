import java.util.*;
class Program1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();

		for(int i=1;i<=rows;i++){
			int n=i;
			for(int j=rows;j>=i;j--){
				System.out.print(n++ +" ");
			}
			System.out.println();
		}
	}
}
