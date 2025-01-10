import java.util.*;
class Program7{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of rows : ");
		int rows=sc.nextInt();
		for(int i=1;i<=rows;i++){
			
			int n=rows;
			int p=rows-i+2;
			for(int k=1;k<=rows-i;k++){
				System.out.print("\t");
			}
			for(int j=1;j<=i;j++){
				System.out.print(n-- +"\t");
			}
			for(int s=2;s<=i;s++){
				System.out.print(p+++"\t");
			}
			System.out.println();
		}
	}
}
