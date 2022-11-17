import java.util.Scanner;

public class Print1ToNRecursion20
{
    public static void print(int n,int i){
        if(i==n){
            System.out.print(n);
        }
        else{
            System.out.print(i+" ");
            print(n,i+1);
        }
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        print(n,1);
    }
}
