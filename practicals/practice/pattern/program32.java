import java.util.*;
class Program32{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Number of rows : ");
		int rows=sc.nextInt();
		for(int i=1;i<=rows;i++){
			int num=i;
			for(int k=1;k<=i;k++){
				System.out.print(" ");
			}
			for(int j=i;j<=rows;j++){
				System.out.print(num++ +" ");
			}
			System.out.println();
		}
		for(int i=rows-1;i>=1;i--){
			int num=i;
			for(int k=1;k<=i;k++){
				System.out.print(" ");
			}
			for(int j=i;j<=rows;j++){
				System.out.print(num++ +" ");
			}
			System.out.println();
		}
		
	}
	
}
