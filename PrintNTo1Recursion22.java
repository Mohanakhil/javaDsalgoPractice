import java.util.Scanner;

public class PrintNTo1Recursion22
{
    public static void printNTo1(int n){
        if(n==0) return;
        System.out.print(n+" ");
        printNTo1(n-1);
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        printNTo1(n);
    }
}
