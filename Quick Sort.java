import java.util.*;

public class Quick {
    public static void main(String[] args){      
        int i,n;
        System.out.print("enter no of ele :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int []a=new int[10];
        System.out.println("enter elements:");
        for( i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        long begin = System.nanoTime();
        quick_sort(a,0,n-1);
        long end = System.nanoTime();
        long diff = end - begin;
        System.out.println("\nsorted array:");  
        for( i=0;i<n;i++){
            System.out.print("  "+a[i]);
        }
        System.out.println("\ntimecomplexity:"+diff);
    }
    
    public static void quick_sort(int a[],int low,int high){
        if(low<high){
            int pi = partition(a,low,high);
            quick_sort(a,low,pi-1);
            quick_sort(a,pi+1,high);
        }          
    }
    public static int partition(int a[],int low,int high ){
        int pivot,i,temp;
        pivot = a[high];
        i = low -1;
        for(int j=low;j<high;j++){
            if(a[j]<= pivot) {
                i++;
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        temp=a[i+1];
        a[i+1]=a[high];
        a[high]=temp;
        return i+1;
    }
}
