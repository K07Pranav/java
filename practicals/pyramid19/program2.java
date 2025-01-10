import java.util.*;
class Program2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();
		int num=0;
		for(int i=1;i<=rows;i++){
			for(int k=1;k<=rows-i;k++){
				System.out.print("\t");
			}
			
			for(int j=1;j<=i*2-1;j++){
				System.out.print(*+"\t");
			}
			System.out.println();
		}
	}
}
