import java.util.*;
class Program38{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();
		System.out.println();
		
		for(int i=1;i<=rows;i++){
			int n=1;
			for(int k=1;k<=rows-i;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print(n++ +" ");
			}
			System.out.println();
		}
	}
}
