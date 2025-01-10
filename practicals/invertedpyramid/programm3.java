import java.util.*;
class Program3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();
		int num=rows;
		for(int i=0;i<rows;i++){
			for(int k=1;k<=i;k++){
				System.out.print("\t");
			}
			for(int j=(rows-i)*2-1;j>=1;j--){
				System.out.print(num+"\t");
			}
			num--;
			System.out.println();
		}
	}
}
