import java.util.*;
class Program6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();
	
		for(int i=1;i<=rows;i++){
			char c=(char)(96+rows);
			int n=rows;
			for(int j=1;j<=i;j++){
				if(i%2==1){
					System.out.print(c--+" ");
				}else{
					System.out.print(n--+" ");
				}
			}
			System.out.println();
		}
	}
}
