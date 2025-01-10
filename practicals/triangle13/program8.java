import java.util.Scanner;
class Program8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();

		for(int i=1;i<=rows;i++){
			int s=rows-i+1;
			char p=(char)(rows-1+64);
			for(int j=rows;j>=i;j--){
				if(i%2==1){
					System.out.print(s-- +" ");
				}else{
					System.out.print(p-- +" ");
				}
			}
			System.out.println();
		}

	}
}
