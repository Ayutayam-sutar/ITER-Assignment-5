import java.util.Scanner;
public class question15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter n terms");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        if(n==1){
            System.out.print(a);
        }else if(n==2){
            System.out.print(a+" "+b);
        }else{
            int count=2;
            System.out.print(a+" "+b);
            while(count<n){
int c=a+b;
System.out.print(" "+c);
count++;
a=b;
b=c;
            }
            
        }
    }
}
