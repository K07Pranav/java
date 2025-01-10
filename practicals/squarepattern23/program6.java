import java.util.*;
class Program6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();
		
		for(int i=1;i<=rows;i++){
			int n=rows*rows;
			for(int j=1;j<=rows;j++){
				if(i%2==1){
					System.out.print(n+"\t");
					n--;
				}else{
					if(n%rows==0){
						System.out.print(n+"\t");
						n=n-5;
					}else{
						System.out.print(n+"\t");
					}
				}
			}
			System.out.println();
		}
	}
}
