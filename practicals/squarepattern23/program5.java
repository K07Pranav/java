import java.util.*;
class Program5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();
		int n=rows;
		
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				if(i%2==0){
					System.out.print(n+"\t");
				}else{
					if(j%2==0){						
						System.out.print("$\t");
					}else{
						System.out.print(n+"\t");
						n++;
					}
				}
			}
			System.out.println();
		}
	}
}
