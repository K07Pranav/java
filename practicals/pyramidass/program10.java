import java.util.*;
class Program10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of rows : ");
		int rows=sc.nextInt();
		for(int i=1;i<=rows;i++){
			
			char n='A';
			char p='a';
			char nn=(char)(64+i-1);
			char pp=(char)(96+i-1);
			for(int k=1;k<=rows-i;k++){
				System.out.print("\t");
			}
			for(int j=1;j<=i;j++){
				if(i%2==1)
				System.out.print(n++ +"\t");
				else
				System.out.print(p++ +"\t");
			}
			for(int s=2;s<=i;s++){
				if(i%2==1)
				System.out.print(nn-- +"\t");
				else
				System.out.print(pp-- +"\t");
			}
			System.out.println();
		}
	}
}
