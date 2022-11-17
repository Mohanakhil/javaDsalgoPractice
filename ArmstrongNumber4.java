import java.util.Scanner;

public class ArmstrongNumber4
{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int t=n;
        int sum=0;
        while(n>0){
            int digit=n%10;
            System.out.println("dig="+digit);
            sum= (int) (sum+Math.pow(digit,3));
            System.out.println("sum= "+sum);
            n=n/10;
        }
         System.out.println(t==sum);
    }
}
