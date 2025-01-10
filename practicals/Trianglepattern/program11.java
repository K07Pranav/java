import java.io.*;
class Program11{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int rows=Integer.parseInt(br.readLine());
		for(int i=1;i<=rows;i++){
			char c=(char)(64+rows);
			for(int j=rows;j>=i;j--){
				System.out.print(c-- +" ");
			}
			System.out.println();
		}
	}
}
