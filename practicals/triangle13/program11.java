import java.util.*;
class Program11{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();
		int n;
		if(rows%2==1){
			int s=rows/2;
			n=(s+1)*rows;
		}else{
			int s=(rows/2);
			n=rows*s+s;
		}
		char q=(char)(64+n);
		for(int i=1;i<=rows;i++){
			for(int j=rows;j>=i;j--){
				System.out.print(q-- +" ");
			}
			System.out.println();
		}
	}
}
