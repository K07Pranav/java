import java.util.*;
class Program6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Size : ");
		int size=sc.nextInt();
		char arr[]=new char[size];
		
		System.out.println("Enter array elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.next().charAt(0);
		}
		
		int vcnt=0,ccnt=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'||arr[i]=='A'||arr[i]=='E'||arr[i]=='I'||arr[i]=='O'||arr[i]=='U'){
				vcnt++;
			}else{
				ccnt++;
			}
		}
	
		System.out.println("Count of vowels : "+vcnt);
		System.out.println("Count of consonants : "+ccnt);
		
	}
}
