import java.util.*;
class Program6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array size : ");
		int size=sc.nextInt();
		char arr[]=new char[size];
		System.out.println("Enter array elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.next().charAt(0);
		}
		
		System.out.println("Consonants are : ");
		for(int j=0;j<arr.length;j++){
			if(arr[j]=='a' || arr[j]=='e' || arr[j]=='i' || arr[j]=='o' || arr[j]=='u' || arr[j]=='U' || arr[j]=='A' || arr[j]=='E' || arr[j]=='I' || arr[j]=='O' || arr[j]=='U'){
				continue;
			}
			System.out.print(arr[j]+"\t");
		}
	}
}
