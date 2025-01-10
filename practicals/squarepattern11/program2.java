import java.util.*;
class Program2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no, of rows : ");
		int rows=sc.nextInt();
		int n=rows;	
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				if(n%3==0){
					System.out.print(n*3+"\t");
				}else if(n%5==0){
					System.out.print(n*5+"\t");
				}else{
					System.out.print(n+"\t");
				}
				n++;
			}
			System.out.println();
		}
	}
}
