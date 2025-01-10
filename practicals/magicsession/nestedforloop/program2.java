import java.util.*;
class program2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		for(int i=1;i<=rows;i++){
			int n=1;
			for(int j=1;j<=rows;j++){
				System.out.print(n+" ");
				n++;
			}
			System.out.println(); 
		}
	}
}
