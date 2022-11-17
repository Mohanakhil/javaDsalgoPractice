import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class RemoveEleArrayStream13
{
    public static void removeElementsArrayUsingStreams(int[] a,int index){
       System.out.println(Arrays.toString(IntStream.range(0,a.length).filter(i->i!=index).map(i->a[i])
               .toArray()));
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]= scanner.nextInt();
        }
        System.out.println(Arrays.toString(a));
        int index= scanner.nextInt();
        removeElementsArrayUsingStreams(a,index);
        scanner.close();
    }
}
