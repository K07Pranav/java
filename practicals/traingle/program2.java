import java.io.*;
class Program2{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter no. of rows : ");
		int rows=Integer.parseInt(br.readLine());
		int s=rows*rows;
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				System.out.print(s+" ");
			}
			System.out.println();
		}
	}
}
