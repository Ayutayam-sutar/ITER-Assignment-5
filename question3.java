import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   System.out.print("Enter first number: ");
   int n1=sc.nextInt();
   System.out.print("Enter second number: ");
   int n2=sc.nextInt();
  System.out.print("Prime numbers between "+n1+ " and "+ n2+ " are: ");
for(int i=n1;i<=n2;i++){
        int count=0;  
        for(int j=2;j<=i/2;j++){
         if(i%j==0){
       count++;
         }
   }
      if(count==0){
       System.out.print(i+ " ");
        }
}
       }
              }
