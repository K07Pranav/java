import java.util.*;
class Program8{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no, of rows : ");
		int rows=sc.nextInt();
		for(int i=1;i<=rows;i++){
			int n=i;
			char ch=(char)(64+rows);
			for(int j=1;j<=rows;j++){
				if(n%2==1){
					System.out.print("#"+"\t");
				}else{
					System.out.print(ch--+"\t");
				}
				n++;
			}
			System.out.println();
		}
	}
}
