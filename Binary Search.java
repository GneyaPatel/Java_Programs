import java.util.*;
public class Binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        //take value from user
        System.out.print("enter no of ele :");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("enter elements in sorted order :");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
       
        //start finding value from array
        System.out.print("Enter no for search:");
        int x=sc.nextInt();
        int i=0,j=n-1;
        long start=System.nanoTime();

        while(i<=j){
            int k=(i+j)/2;
            if(x==a[k]){
                System.out.println("ele at position "+(k+1));
                break;
            }else if(x<a[k]){
                     j=k-1;
            }
            else{
                     i=k+1;
            }
        }
        if(i>j)
            System.out.println(x+" not found in array...");
       
        long end=System.nanoTime();
        System.out.println("time taken : "+(end-start));
    }
}

MAKING CHANGE:-----------------------------------------------------------------

package Practicals;
import java.util.*;

public class Making_Change {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter total amount :");
        int N=sc.nextInt();
        System.out.print("Enter no of coins :");
        int n=sc.nextInt();
        System.out.println("Enter value of coins :");
        int d[]=new int[n];
        for(int i=0;i<n;i++){
            d[i]=sc.nextInt();
        }
        int c[][]=new int[n][N+1];
        int i,j;
        for(i=0;i<n;i++){
            c[i][0]=0;
        }
        for(i=0;i<n;i++){
            for(j=0;j<N+1;j++){
                if(i==0 && j<d[i]){
                    c[i][j]=0;
                }
                else if(i==0){
                    c[i][j]=1+c[0][j-d[0]];
                }
                else if(j<d[i]){
                    c[i][j]=c[i-1][j];
                }
                else{
                    c[i][j]=Math.min(c[i-1][j], 1+c[i][j-d[i]]);
                }
            }
        }
        for(i=0;i<n;i++){
            for(j=0;j<N+1;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("total coin is :"+c[n-1][N]);
    }
}
