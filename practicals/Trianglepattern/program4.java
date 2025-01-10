import java.io.*;
class Program4{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int rows=Integer.parseInt(br.readLine());
		char c='A';	
		for(int i=1;i<=rows;i++){
			c=(char)(i+64);
			for(int j=1;j<=i;j++){
				System.out.print(c++ +" ");
			}
			System.out.println();
		}
	}
}
