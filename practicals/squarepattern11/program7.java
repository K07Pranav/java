import java.util.*;
class Program7{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no, of rows : ");
		int rows=sc.nextInt();
		int n=rows;
		char ch='A';	
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				if(n%2==1){
					System.out.print(ch+"\t");
				}else{
					System.out.print(n+"\t");
				}
				n++;
			}
			ch++;
			System.out.println();
		}
	}
}
