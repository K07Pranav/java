import java.util.*;
class Program9{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();
		int s=rows;
		for(int i=1;i<=rows;i++){
			int n=1;
			char c=(char)(64+s);
			for(int j=rows;j>=i;j--){
				if(i%2==1){
					System.out.print(n++ +" ");
				}else{
					System.out.print(c-- +" ");		
				}
			}s--;
			System.out.println();
		}
	}
}
