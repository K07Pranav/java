import java.util.*;
class Program9{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no, of rows : ");
		int rows=sc.nextInt();
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				if(i%2==1){
					if(j%2==1){
						System.out.print(j*2+"\t");
					}else{
						System.out.print(j*3+"\t");
					}
				}else{
					if(j%2==0){
						System.out.print(j*2+"\t");
					}else{
						System.out.print(j*3+"\t");
					}
				}
			}
			System.out.println();
		}
	}
}
