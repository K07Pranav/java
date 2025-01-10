import java.util.*;
class Program7{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();
		
		for(int i=0;i<rows;i++){
			char ch='A';
			for(int k=1;k<=i;k++){
				System.out.print("\t");
			}
			for(int j=(rows-i)*2-1;j>=1;j--){
				if(j>=rows-i+1)
				System.out.print(ch+++"\t");
				else
				System.out.print(ch--+"\t");
			}
			System.out.println();
		}
	}
}
