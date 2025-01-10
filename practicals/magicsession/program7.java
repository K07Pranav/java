import java.io.*;
class Program7{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		
		for(int i=10;i>=1;i--){
			System.out.println(i*num);
		}
	}
}
