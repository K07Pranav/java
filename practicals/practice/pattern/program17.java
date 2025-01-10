import java.util.*;
class Program17{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Number of sides of square : ");
		int rows=sc.nextInt();
		for(int i=1;i<=rows;i++){
			if(i==1 || i==rows){
				for(int j=1;j<=rows;j++){
					System.out.print("* ");
				}
			}else{
				for(int k=1;k<=1;k++){
					System.out.print("* ");
				}
				for(int p=1;p<rows*2-3;p++){
					System.out.print(" ");
				}
				for(int n=1;n<=1;n++){
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
