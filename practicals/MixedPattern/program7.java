import java.util.*;
class Program7{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();
		int num=2;
		for(int i=1;i<=rows;i++){
			for(int j=rows;j>=i;j--){
				if(num<=9){
					System.out.print(num+"  ");
				}else{
					System.out.print(num+" ");
				}
				num+=2;
			}
			System.out.println();
		}
	}
}
