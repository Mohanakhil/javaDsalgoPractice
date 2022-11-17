import java.util.Scanner;

public class LinearSearch24
{
    public static int linearSearch(int[] a){}

    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scanner.nextInt();
        }
        int index=linearSearch(a);
    }
}
