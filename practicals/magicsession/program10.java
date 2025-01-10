import java.io.*;
class Program10{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Math Marks : ");
		float m1=Float.parseFloat(br.readLine());

		System.out.print("Enter Marathi Marks : ");
		float m2=Float.parseFloat(br.readLine());

		System.out.print("Enter Science Marks : ");
		float m3=Float.parseFloat(br.readLine());

		System.out.print("Enter English Marks : ");
		float m4=Float.parseFloat(br.readLine());
		
		float sum=0f;

		if(m1<=100 && m1>=0 && m2<=100 && m2>=0 && m3<=100 && m3>=0 && m4<=100 && m4>=0){
			sum=m1+m2+m3+m4;
			System.out.println("Total marks : "+sum);
		}else{
			System.out.println("Enter Valid Marks");
		}

	}
}
