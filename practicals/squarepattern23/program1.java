import java.util.*;
class Program1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();
		int n=rows;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				if(n%rows==0){
					System.out.print((char)(64+n)+"\t");
				}
				else{
					System.out.print((char)(96+n)+"\t");
				}
				n++;
			}
			System.out.println();
		}
	}
}