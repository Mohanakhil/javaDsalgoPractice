import java.util.Scanner;

public class Print1toNBackTracking21
{
    //print from 1 to N using backtracking(ie recursion without calling +1 addition)
    //for difference between recursion and backtracking check 20th problem


    public static void print1ToNBackTracking(int n){
        if(n==0) return;
        else{
            print1ToNBackTracking(n-1);
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        print1ToNBackTracking(n);
    }
}
