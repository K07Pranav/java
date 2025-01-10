import java.util.*;
class Program4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();
		char ch='A';
		for(int i=1;i<=rows;i++){
			if(rows%2==1)
			ch=(char)(64+i);
			else
			ch=(char)(96+i);

			for(int k=1;k<=i;k++){
				System.out.print("\t");
			}
			for(int j=1;j<=rows-i+1;j++){
				System.out.print(ch+++"\t");
			}
			System.out.println();
		}
	}
}
