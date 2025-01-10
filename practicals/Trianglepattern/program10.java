import java.io.*;
class Program10{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int rows=Integer.parseInt(br.readLine());
		for(int i=1;i<=rows;i++){
			int n=i;
			for(int j=rows;j>=i;j--){
				System.out.print(n++ +" ");
			}
			System.out.println();
		}
	}
}
