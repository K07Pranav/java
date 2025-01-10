import java.util.*;
class Program9{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();
		int n=rows;
		for(int i=1;i<=rows;i++){
			n=rows+i-1;
			for(int k=1;k<=rows-i;k++){
				System.out.print("\t");
			}
			for(int j=1;j<=i+i-1;j++){
				System.out.print(n+"\t");
				n--;
			}
			System.out.println();
		}
	}
}
