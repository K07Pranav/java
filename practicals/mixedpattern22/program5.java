import java.util.*;
class Program5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();
		int n=3;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				if(i%2==1)
					System.out.print(n*n+"\t");
				else
					System.out.print(n+"\t");
				n++;
			}
			System.out.println();
		}
	}
}
