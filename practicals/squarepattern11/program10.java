import java.util.*;
class Program10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no, of rows : ");
		int rows=sc.nextInt();
		
		for(int i=1;i<=rows;i++){
			int s=i;
			int n=rows;
			char ch=(char)(64+rows);
			for(int j=1;j<=rows;j++){
				if(i%2==1){
					if(s%2==1){
						System.out.print(n+"\t");
					}else{
						System.out.print(ch+"\t");
					}
				}else{
					System.out.print(ch+"\t");
				}
				n--;
				ch--;
				s++;
			}
			System.out.println();
		}
	}
}
