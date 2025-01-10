import java.util.*;
class Program4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();
		for(int i=0;i<rows;i++){
			int num=1;
			for(int k=1;k<=i;k++){
				System.out.print("\t");
			}
			for(int j=(rows-i)*2-1;j>=1;j--){
				System.out.print(num+++"\t");
			}
			System.out.println();
		}
	}
}
