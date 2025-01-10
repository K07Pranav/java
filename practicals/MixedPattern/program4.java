import java.util.*;
class Program4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows : ");
		int rows=sc.nextInt();
		
		for(int i=1;i<=rows;i++){
			int num=rows+1-i;
			int p=rows+1-i;
			for(int j=1;j<=i;j++){
				if(i==1){
					System.out.print(rows);
				}else if(i==rows){
					System.out.print(j+" ");
				}else{
					System.out.print(num+" ");
					num+=p;		
				}
			}num--;
			System.out.println();
		}
	}
}
