import java.util.*;
class Program7{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();
		int n=rows;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				if(j%2==1){
					System.out.print((n*n)-1+"\t");
				}else{
					System.out.print(n*n+"\t");
				}
				n++;
			}
			System.out.println();
		}
	}
}
