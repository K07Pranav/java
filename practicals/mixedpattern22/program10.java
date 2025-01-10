import java.util.*;
class Program10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();
		for(int i=1;i<=rows;i++){
			int n=rows;
			int p=1;
			for(int k=1;k<=rows-i;k++){
				System.out.print("\t");
			}
			for(int j=1;j<=i+i-1;j++){
				if(j>=i)
				System.out.print(p+++"\t");
				else
				System.out.print(n--+"\t");
			}
			System.out.println();
		}
	}
}
