import java.util.*;
class Program11{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		System.out.print("Enter Name : ");
		String studname=sc.next();

		System.out.print("Enter College Name : ");
		String clgname=sc.next();

		System.out.print("Enter Student Id : ");
		int studid=sc.nextInt();

		System.out.print("Enter CGPA: ");
		int studcgpa=sc.nextFloat();

		System.out.println("*** Student Details ***");
		System.out.println("Student Name : "+studname);
		System.out.println("Student College Name : "+clgname);
		System.out.println("Student ID : "+studid);
		System.out.println("Student CGPA : "+studcgpa);
	}
}
