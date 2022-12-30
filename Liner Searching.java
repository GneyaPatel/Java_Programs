import java.util.*;

public class LInear {
    public static void main(String[] args) {
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of ele :");
        n=sc.nextInt();
        int A[]=new int[n];
        
        System.out.println("Enter elements:");
        for(i=0;i<n;i++){
            A[i]=sc.nextInt();
        }

        System.out.print("Enter ele for search :");
        int x=sc.nextInt();
        long begin=System.nanoTime();

        for(i=0;i<n;i++){
            if(A[i]==x){
                System.out.println("ele at position :"+(i+1));
                break;
            }
        }
        if(i==n){
            System.out.println(x+" is not in array.");
        }

        long end=System.nanoTime();
        long diffrence=end-begin;
        System.out.println("\nTime taken:"+diffrence);
    }
}
