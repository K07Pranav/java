import java.util.*;
class Sidetriangle6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows: ");
		int rows=sc.nextInt();

		int col=0;
		
		for(int i=1;i<rows*2;i++){
			int n=1;
			if(i<=rows){
				col=rows-i;
			}else{
				col=i-rows;
			}
			for(int k=1;k<=col;k++){
				System.out.print("\t");
			}


			if(i<=rows){
				col=i;
			}else{
				col=rows*2-i;
			}

			for(int j=1;j<=col;j++){
				System.out.print(n+++"\t");
			}
			System.out.println();
		}

	}
}