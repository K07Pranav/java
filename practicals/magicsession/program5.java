import java.io.*;
class Program5{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		if(num%16==0){
			System.out.println(num+" is present in the table of 16");
		}else{
			System.out.println(num+" is not present in the table of 16");
		}
	}
}
