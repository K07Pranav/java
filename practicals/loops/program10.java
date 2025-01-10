import java.io.*;
class Program10{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Number : ");
		int rows=Integer.parseInt(br.readLine());
		int i=1;
		while(i<=rows){
			for(int k=1;k<=rows-i;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			i++;
			System.out.println();
		}
	}
}
