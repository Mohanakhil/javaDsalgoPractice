import java.util.Scanner;

public class RemoveEleFromAnyArrayPosition12
{
    public static void printArray(int[] a){
        for(int ele:a){
            System.out.print(ele+" ");
        }
    }
    public static void removeElementFromIndex(int[] a,int index){
        int[] removedArray=new int[a.length-1];
        int j=0;
        for(int i=0;i<a.length;i++){
            if(i!=index){
                removedArray[j]=a[i];
                j++;
            }
        }
        printArray(removedArray);
    }

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]= scanner.nextInt();
        }
        printArray(a);
        int index= scanner.nextInt();
        removeElementFromIndex(a,index);
    }
}
