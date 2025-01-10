import java.util.*;
class Program9{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();
		
		for(int i=1;i<=rows;i++){
			int n=i;
			for(int k=1;k<=i;k++){
				System.out.print("\t");
			}
			for(int j=(rows-i)*2+1;j>=1;j--){
				if(j%2==1)
				System.out.print(1+"\t");
				else
				System.out.print(0+"\t");
			}
			System.out.println();
		}
	}
}
