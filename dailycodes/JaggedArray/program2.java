import java.io.*;
class Program2{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter array size : ");
		int size=Integer.parseInt(br.readLine());

		int arr[]=new int[size];
		System.out.println("Enter elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		System.out.println("Array elements are : ");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}
