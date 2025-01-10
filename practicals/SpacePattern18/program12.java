import java.util.*;
class Program12{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();
		
		for(int i=1;i<=rows;i++){
			int n=i;
			int s=rows-i+1;
	
			for(int k=1;k<i;k++){
				System.out.print("\t");
			}
			for(int j=1;j<=rows-i+1;j++){
				if(s%2==0)
				System.out.print((64+n)+"\t");
				else
				System.out.print((char)(64+n)+"\t");
				n++;
				s--;
			}
			System.out.println();
		}
	}
}
