package Practicals;
import java.util.*;

public class Insertion {
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
        int i,j,x;

        long begin=System.nanoTime();
        
        for(i=1;i<n;i++){
            x=A[i];
            j=i-1;
            while(j>=0 && A[j]>x){
                A[j+1]=A[j];
                j=j-1;
            }
            A[j+1]=x;
            System.out.print(i+" iteration :");
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

