import java.util.Scanner;

public class SumOfNRecursion24
{
    public static int sumOfN(int n){
        if(n==0) return 0;
        return n+sumOfN(n-1);
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        System.out.println(sumOfN(n));
    }
}
