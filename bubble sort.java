package Practicals;
import java.util.*;

public class Bubble {
    public static void main(String[] args) {
        int n,temp;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of ele :");
        n=sc.nextInt();
         int A[]=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }
        long begin=System.nanoTime();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i-1);j++){
                if(A[j]>A[j+1]){
                    temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                }
            }

            System.out.print((i+1)+" iteration :");
            for(int j=0;j<n;j++){
                System.out.print(A[j]+" ");
            }
            System.out.println("");
        }
        System.out.print("\nSorted array :");
        for(int i=0;i<n;i++){
            System.out.print(A[i]+" ");
        }
        long end=System.nanoTime();
        long diffrence=end-begin;
        System.out.println("\nTime taken:"+diffrence);
    }
}
