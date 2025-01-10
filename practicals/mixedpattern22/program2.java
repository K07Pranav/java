import java.util.*;
class Program2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();
		int n=1;
		int s=1;

		for(int i=1;i<=rows;i++){
			n=s;
			for(int k=1;k<=i-1;k++){
				System.out.print("\t");
			}
			for(int j=1;j<=rows-i+1;j++){
				System.out.print(n+"\t");
				s=n;
				n++;
			}
			System.out.println();
		}
	}
}
