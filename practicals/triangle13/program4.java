import java.util.*;
class Program4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();
		int sum=0;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				sum++;
			}
		}
		char n=(char)(64+sum);
		for(int i=1;i<=rows;i++){
			for(int j=rows;j>=i;j--){
				System.out.print(n-- +" ");
			}
			System.out.println();
		}
	}
}
