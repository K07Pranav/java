import java.util.*;
class Program3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enetr Size : ");
		
		int size=sc.nextInt();
		char arr[]=new char[size];
	
		System.out.println("Enter elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.next().charAt(0);
		}
	
		for(int i=0;i<arr.length;i++){
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'){
				System.out.println("vowel "+arr[i]+" found at index "+i);
			}
		}
	}
}
