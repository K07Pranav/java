import java.util.*;
class Program20{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Number of rows : ");
		int rows=sc.nextInt();
		for(int i=1;i<=rows;i++){
			if(i%2==1){
				for(int j=1;j<=i;j++){
					if(j%2==1){
						System.out.print("1 ");
					}
					else{
						System.out.print("0 ");
					}
				}
			}else{
				for(int j=1;j<=i;j++){
					if(j%2==1){
						System.out.print("0 ");
					}else{
						System.out.print("1 ");
					}
				}
			}
			System.out.println();
		}
	}
}
