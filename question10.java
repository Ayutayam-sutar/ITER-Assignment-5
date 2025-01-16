import java.util.*;
public class question10 {
    public static void main (String[]args){
Scanner sc=new Scanner(System.in);
System.out.print(" Enter a number > 3 : ");
int n=sc.nextInt();
int a=0;
int b=1;
int c=1;
// if(n==1){
// System.out.println(a);
// } else if(n==2){
//     System.out.print(a+" "+b);
// }else if(n==3){
//     System.out.print(a+" "+b+" "+c);
// }else{
  if(n>3){ 
    int count=4;
    System.out.print(a+" "+b+" "+c);
    while(count<=n){
int ans=a+b+c;
System.out.print(" "+ans);
count++;
a=b;
b=c;
c=ans;
    }
}
  }

    }

