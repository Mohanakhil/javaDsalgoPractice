import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class LinearSearch24
{
    public static OptionalInt linearSearch(int[] a, int x){
        return IntStream.range(0,a.length).filter(i->a[i]==x).findFirst();
    }

    public static void  main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scanner.nextInt();
        }
        int x= scanner.nextInt();
        System.out.println(linearSearch(a,x));
    }
}
