import java.util.Scanner;

public class InsertIntoArray10
{
    public static void printArray(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]= scanner.nextInt();
        printArray(a);
    }
}
