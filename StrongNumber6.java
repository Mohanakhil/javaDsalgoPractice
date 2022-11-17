import java.util.Scanner;

public class StrongNumber6
{
    public static int fact(int n){
        int fact=1;
        while(n>0){
            fact=fact*n;
            n--;
        }
        return fact;
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int t=n;
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum=sum+fact(digit);
            n=n/10;
        }
        System.out.println(t==sum);
    }
}
