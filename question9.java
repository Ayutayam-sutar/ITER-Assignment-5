 import java.util.*;
 public class question9 {
    public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);    
   
    System.out.print("Enter the value n : ");
    int n=sc.nextInt();
     if(n>0){
    double sum=0.0;
  for(int i=1;i<=n;i++){
    sum+=1.0/(i*i);
  }
  System.out.println(sum);
  }else{
    System.out.println("Not possible");
  }
sc.close();

    }
}
