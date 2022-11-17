import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray19
{
    public static void reverseArray(int[] a){
        int start=0,last=a.length-1;
        while(start<last){
            int temp=a[start];
            a[start]=a[last];
            a[last]=temp;
            start++;last--;
        }
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]= scanner.nextInt();
        }
        System.out.println(Arrays.toString(a));
        reverseArray(a);
    }
}
