import java.util.*;
class Program9{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();
		int s=rows;
		for(int i=1;i<=rows;i++){
			int n=rows*i*s;
			for(int j=1;j<=rows;j++){
				if(j%2==0){
					System.out.print("@\t");
				}else{
					System.out.print(n+"\t");
					n=n-i*2;
				}
			}
			s--;
			System.out.println();
		}
	}
}
