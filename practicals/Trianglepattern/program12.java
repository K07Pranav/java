import java.io.*;
class Program12{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int rows=Integer.parseInt(br.readLine());
		int n=1;
		for(int i=1;i<=rows;i++){
			n=i;
			if(i%2==0){
				for(int j=rows;j>=i;j--){
					if(j%2==0)
					System.out.print((char)(n+64)+" ");	
					else
					System.out.print((n+64)+" ");	
					n++;
				}
			}else{
				for(int s=rows;s>=i;s--){
					if(s%2==1)
					System.out.print((char)(n+64)+" ");	
					else
					System.out.print((n+64)+" ");	
					n++;
				}
			}
			System.out.println();
		}
	}
}
