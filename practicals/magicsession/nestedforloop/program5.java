import java.util.*;
class program5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				System.out.print(i+" ");
			}
			System.out.println(); 
		}
	}
}