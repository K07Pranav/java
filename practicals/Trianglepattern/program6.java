import java.io.*;
class Program6{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int rows=Integer.parseInt(br.readLine());
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				System.out.print((i*j) +" ");
			}
			System.out.println();
		}
	}
}
