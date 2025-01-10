import java.util.*;
class Program6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();

		for(int i=1;i<=rows;i++){
			char ch2='a';
			int n=1;
			int s=1;
			for(int j=rows;j>=i;j--){
				if(s%2==1)
				System.out.print(n++ +" ");
				else
				System.out.print(ch2++ +" ");
				s++;
			}
			System.out.println();
		}
	}
}
