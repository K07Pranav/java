import java.util.*;
class Program33{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Number of rows : ");
		int rows=sc.nextInt();
		for(int i=1;i<=rows;i++){
			for(int k=1;k<=rows-i;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=1;j++){
				System.out.print("* ");
			}
			if(i==rows){
				for(int n=1;n<=rows-2;n++){
					System.out.print("*  ");
				}
			}else{
				for(int p=4;p<=i*2;p++){
					System.out.print(" ");
				}
			}
			if(i>=2){
				for(int s=2;s<=2;s++){
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
	
}
