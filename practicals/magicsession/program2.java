import java.io.*;
class Program2{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int age=Integer.parseInt(br.readLine());
		if(age>0){
			if(age>=18){
				System.out.println("Voter is eligible for voting");
			}else{
				System.out.println("Voter is not eligible");
			}
		}else{
			System.out.println("Invalid age");
		}
	}
}
