import java.util.Scanner;

public class SumOfNaturalNumbersRecursion16
{
    public static int sumOfNaturalNumbers(int n){
        if(n==1){
            return 1;
        }
        return n+sumOfNaturalNumbers(n-1);
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        System.out.println(sumOfNaturalNumbers(n));
    }
}
