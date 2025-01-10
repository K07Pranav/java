import java.io.*;
class Program9{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter no. of rows : ");
		int rows=Integer.parseInt(br.readLine());
		char c='c';	
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				if(j%2==1){
					System.out.print(j+" ");
				}else{						
					System.out.print(c+" ");
					c+=2;
				}
			}
			System.out.println();
		}
	}
}
