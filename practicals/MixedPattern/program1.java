import java.util.*;
class Program1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();
		int num=1;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				if(num<=9){
					System.out.print(num++ +"  ");	
				}else{
					System.out.print(num++ +" ");	
				}
			}
			System.out.println();
		}
	}
}
