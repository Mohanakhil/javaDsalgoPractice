import java.util.Scanner;

public class SpyNumber8
{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int sum=0;
        int prod=1;
        while(n>0){
            int digit=n%10;
            sum=sum+digit;
            prod=prod*digit;
            n/=10;
        }
      System.out.println(sum==prod);
    }
}
