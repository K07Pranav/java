import java.util.Scanner;
class Program9{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();
		int s=(rows*rows)+(rows-1);
		for(int i=1;i<=rows;i++){
			for(int j=rows;j>=i;j--){
				System.out.print(s+" ");
				s-=2;
			}
			System.out.println();
		}

	}
}
