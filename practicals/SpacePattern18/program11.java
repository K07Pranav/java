import java.util.*;
class Program11{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();

		for(int i=1;i<=rows;i++){
			char n=(char)(64+rows);
			for(int k=1;k<i;k++){
				System.out.print("\t");
			}
			for(int j=1;j<=rows-i+1;j++){
				System.out.print(n--+"\t");
			}
			System.out.println();
		}
	}
}
