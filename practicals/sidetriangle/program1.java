import java.util.*;
class Sidetriangle{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows: ");
		int rows=sc.nextInt();

		int col=0;
		for(int i=1;i<rows*2;i++){
			if(i<=rows){
				col=i;
			}else{
				col=rows*2-i;
			}

			for(int j=1;j<=col;j++){
				System.out.print("#\t");
			}
			System.out.println();
		}

	}
}