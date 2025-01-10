import java.io.*;
class Program7{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int rows=Integer.parseInt(br.readLine());
		for(int i=1;i<=rows;i++){
			for(int j=rows;j>=i;j--){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
