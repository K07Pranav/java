import java.util.*;
class Program5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();

		for(int i=1;i<=rows;i++){
			char ch1='A';
			char ch2='a';
			for(int j=rows;j>=i;j--){
				if(i%2==1)
				System.out.print(ch1++ +" ");
				else
				System.out.print(ch2++ +" ");
			}
			System.out.println();
		}
	}
}
