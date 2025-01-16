import java.util.*;
public class question8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value n : ");
        int n=sc.nextInt();
        int sum=0;
      for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
sum=sum+j;
        }
       
      }  
      System.out.print("The answer is "+sum);
      sc.close();
    }
}
