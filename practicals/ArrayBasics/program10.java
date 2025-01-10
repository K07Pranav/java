import java.util.*;
class Program10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size : ");
		int size=sc.nextInt();
		
		char arr[]=new char[size];
		
		for(int i=0;i<arr.length;i++){
			System.out.print("Enter Grade of Students");
			arr[i]=sc.next().charAt(0);
		}
		
		for(int i=0;i<arr.length;i++){	
			System.out.println("Grade of Students : "+arr[i]);
		}

	}
}
