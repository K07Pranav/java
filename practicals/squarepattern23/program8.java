import java.util.*;
class Program8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();
		int n=rows;
		int s=rows+1;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				if(i%2==0){
					System.out.print((char)(96+s)+"\t");
				}else{
					if(j%2==0){						
						System.out.print((char)(96+s)+"\t");
					}else{
						System.out.print(n*n-1+"\t");
					}
				}
				n++;
				s++;
			}
			System.out.println();
		}
	}
}
