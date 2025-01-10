mport java.io.*;
class program9 {
        public static void main(String args[])throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.print("Enter a number : ");
                int num = Integer.parseInt(br.readLine());

                int count =0;
                int temp = num;
                int rev =0;
                int rem=0;

                while(num>0) {
                        rem = num%10;
                        rev = rem + rev*10;
                        count++;
                        num/=10;
                }
                int arr[] = new int[count];

                int rem1= 0;
                int rev1=0;
                int i=0;

                while(rev>0) {
                        rem =temp%10;
                        rev1=rem1 + rev1*10;
                        num/=10;
                        arr[i]=rev1+1;
                        i++;
                }
                for(int j=0;j<count;j++) {
                        System.out.print(arr[j]+",");
                }
        }