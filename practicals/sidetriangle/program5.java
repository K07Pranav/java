import java.util.*;
class Sidetriangle5{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of rows: ");
		int rows=sc.nextInt();

		int col=0;
		char n=64;
		for(int i=1;i<rows*2;i++){
			if(i<=rows){
				col=i;
				n=(char)(64+rows-i+1);
			}else{
				col=rows*2-i;
				n=(char)(64+i-rows+1);
			}

			for(int j=1;j<=col;j++){
				System.out.print(n+"\t");
			}
			System.out.println();
		}

	}
}
