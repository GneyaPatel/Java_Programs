import java.util.*;

public class Selection {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of ele :");
        n=sc.nextInt();
        int A[]=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        long begin=System.nanoTime();
        int i,j,minj,minx;
        for(i=0;i<n;i++){
            minj=i;
            minx=A[i];
            for(j=i+1;j<n;j++){
                if(A[j]<minx){
                    minj=j;
                    minx=A[j];
                }
            }
            A[minj]=A[i];
            A[i]=minx;
            System.out.print((i+1)+" iteration :");
            for(j=0;j<n;j++){
                System.out.print(A[j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Sorted array :");
        for(i=0;i<n;i++){
            System.out.print(A[i]+" ");
        }
        long end=System.nanoTime();
        long diff=end-begin;
        System.out.println("\nTime taken:"+diff);
    }
}