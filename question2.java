import java.util.Scanner;
public class question2 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
   System.out.print("Enter number: ");
   int n1=sc.nextInt();
   int count1=0;int rem;int rev=0;int count2=0;
   for(int i=1;i<=n1;i++){
    if(n1%i==0){
    count1++;
    }
     } 
if(count1==2){
    while (n1!=0) {
        rem=n1%10;
        rev=rev*10+rem;
        n1=n1/10;
    }  
    for(int i=1;i<=rev;i++){
        if(rev%i==0){
        count2++;
        }
         } 
         if(count2==2){
System.out.println("Twisted prime");
         }else{
    System.out.println("Not twisted prime ");
}}else{
    System.out.println("Not twisted prime ");
}
sc.close();
    }
}
