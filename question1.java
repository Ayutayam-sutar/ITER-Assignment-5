import java.util.Scanner;
public class question1 {
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter first number: ");
   int n1=sc.nextInt();
   System.out.print("Enter second number: ");
   int n2=sc.nextInt();
int sum1=0;
int sum2=0;
for(int i=1;i<n1;i++){
if(n1%i==0){
    sum1=sum1+i;
      }
 } 
for(int i=1;i<n2;i++){
    if(n2%i==0){
        sum2=sum2+i;
    }
}
if(sum1==n2&&sum2==n1){
System.out.println(n1+" and "+n2+" are amicable numbers ");
}else {
    System.out.println(n1+" and "+n2+" are not amicable numbers ");
}
sc.close();
    }
}