import java.util.Scanner;

public class PrintNTimesRecursion17
{
    public static void printNTimes(String name,int n){
        if(n==0) return;
        else {
            System.out.println(name);
            printNTimes(name, n - 1);
        }
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String name= scanner.next();
        int n= scanner.nextInt();
        printNTimes(name,n);
    }
}
