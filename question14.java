import java.util.Scanner;
public class question14 {
    public static void main (String args[]){
Scanner sc=new Scanner (System.in);
System.out.println("Enter the value ");
double x=sc.nextDouble();
System.out.println("Enter the no of times to be calculate");
int n=sc.nextInt();
double sum=0.0;
int p=0;
x=Math.toRadians(x);
for(int i=1;i<=n;i++){
    int fact=1;
    for(int j=1;j<=p;j++){
          fact=fact*j;
    }
    if(i%2==0){
        sum=sum-Math.pow(x,p)/fact;
    }else{
        sum=sum+Math.pow(x,p)/fact;
       p=p+2;
    }
}
System.out.println(sum); 
    }
}



