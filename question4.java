import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   System.out.print("Enter the value of m: ");
   int n1=sc.nextInt();
   System.out.print("Enter the value of n: ");
   int n2=sc.nextInt();
  if(n1<n2&&n1>0&&n2>0){
   for(int i=n1;i<=n2;i++){
     int prod=1; 
     for(int j=1;j<=i;j++){
     prod=prod*j;
      
  }
System.out.println("Factorial of "+i+" is: "+prod);
}
   }
   sc.close();
     } 
         }
