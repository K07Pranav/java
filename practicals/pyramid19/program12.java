import java.util.*;
class Program12{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();
	
		for(int i=1;i<=rows;i++){
			char ch=(char)(64+i);
			int num=64+i;	
			int p=i+rows;		
			for(int k=2;k<=i;k++){
				System.out.print("\t");
			}
			for(int j=rows;j>=i;j--){
				if(p%2==1)
				System.out.print(num +"\t");
				else
				System.out.print(ch +"\t");
				num++;
				ch++;
				p--;
			}
			System.out.println();
		}
	}
}
