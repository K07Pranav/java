import java.util.*;
class Program8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();
		/*int p;
		if(rows%2==1){
			int n=rows/2+1;
			p=rows*n;
		}else{
			int n=rows/2;
			p=rows*n+n;
		}*/
		int p=rows*(rows+1)/2;
		char c=(char)(64+p);
		for(int i=1;i<=rows;i++){
			for(int j=rows;j>=i;j--){
				System.out.print(c-- +" ");
			}
			System.out.println();
		}
	}
}
