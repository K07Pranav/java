import java.util.*;
class Program18{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num=1;
		System.out.print("Number of rows : ");
		int rows=sc.nextInt();
		for(int i=1;i<=rows;i++){
			for(int k=1;k<=rows-i;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print(num+" ");
			}
			num++;
			System.out.println();
		}
	}
}
