import java.util.*;
class Program2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();
		
		int n=2;
		for(int i=1;i<=rows;i++){
			for(int j=rows;j>=i;j--){
				System.out.print(n +"  ");
				n+=2;
			}
			System.out.println();
		}
	}
}
