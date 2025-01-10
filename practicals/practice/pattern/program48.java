import java.util.*;
class heart{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of Rows : ");
		int rows=sc.nextInt();
		int n=rows/2;
		int d=(rows/2)-3;
		int z=1;
		for(int i=1;i<=rows/2-2;i++){
			for(int j=rows/2-2;j>=i;j--){
				System.out.print(" ");
			}
			for(int p=1;p<=n;p++){
				System.out.print("*");
			}
			for(int s=rows/2;s>=z;s--){
				System.out.print(" ");
			}
			for(int a=1;a<=n;a++){
				System.out.print("*");
			}
			n+=2;
			z+=2;
			System.out.println();
		}
		for(int i=1;i<=rows;i++){
			for(int k=1;k<=i;k++){
				System.out.print(" ");
			}
			for(int j=rows;j>=i;j--){
				System.out.print("*");
			}
			for(int s=rows-1;s>=i;s--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
