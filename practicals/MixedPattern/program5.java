import java.util.*;
class Program5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();
		
		for(int i=1;i<=rows;i++){
			int num=i;
			for(int j=1;j<=i;j++){	
				System.out.print(num+" ");
				num+=i;	
			}
			System.out.println();
		}
	}
}
