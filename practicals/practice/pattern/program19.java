import java.util.*;
class Program19{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Number of rows : ");
		int rows=sc.nextInt();
		for(int i=1;i<=rows;i++){
			int num=1;
			for(int j=1;j<=i;j++){
				System.out.print(num++ +" ");
			}
			System.out.println();
		}
	}
}
