import java.util.*;
class Program21{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Number of rows : ");
		int rows=sc.nextInt();
		for(int i=1;i<=rows;i++){
			int num2=i;
			int num1=2;
			for(int k=1;k<rows-i+1;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print(num2);
				num2--;
			}
			for(int p=2;p<=i;p++){
				System.out.print(num1);
				num1++;
			}
			System.out.println();
		}
	}
}
