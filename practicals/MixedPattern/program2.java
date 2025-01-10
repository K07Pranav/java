import java.util.*;
class Program2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();
		char ch=(char)(64+rows);
		for(int i=1;i<=rows;i++){
			int num=rows-1+i;
			for(int j=1;j<=rows;j++){
				System.out.print(ch +""+ num-- +" ");	
			}
			System.out.println();
		}
	}
}
