import java.util.*;
class Program22{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Number of rows : ");
		int rows=sc.nextInt();
		for(int i=1;i<=rows;i++){
			for(int k=1;k<i;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=rows-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
