import java.util.Scanner;

public class LinearSearchForLoop25 {
    public static int findIndex(int[] a,int x){
        for(int i=0;i<a.length;i++){
            if(a[i]==x)
                return i;
        }
        return -1;
    }
    public static void printArray(int[] a){
        for(int ele:a){
            System.out.print(ele+" ");
        }
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]= scanner.nextInt();
        }
        printArray(a);
        int x= scanner.nextInt();
        System.out.println(findIndex(a,x));
    }
}
