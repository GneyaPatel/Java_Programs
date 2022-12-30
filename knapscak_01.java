import java.util.*;
public class Knapsack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,W;
        System.out.print("Enter no of object :");
        n=sc.nextInt();
        System.out.print("Enter total weight :");
        W=sc.nextInt();
        int w[]=new int[n];
        int v[]=new int[n];
        int a[][]=new int[n+1][W+1];
        System.out.println("Enter weight:");
        for(int i=0;i<n;i++){
            w[i]=sc.nextInt();
        }
        System.out.println("Enter values:");
        for(int i=0;i<n;i++){
            v[i]=sc.nextInt();
        }
        int i, j;           
        for(i = 0; i<= n; i++) {
            for(j = 0; j<= W; j++) {
                if (i == 0 || j == 0){
                    a[i][j] = 0;  
                }
                else if (w[i - 1]<= j){  
                    a[i][j] =Math.max(v[i - 1] + a[i - 1][j - w[i - 1]], a[i - 1][j]); 
                }
                else{
                    a[i][j] = a[i - 1][j];  
                }
            }
        }         
        for (i = 0; i<= n; i++){            
            for (j = 0; j<= W; j++){              
                System.out.print(a[i][j]+" ");                
            }
            System.out.println();            
        }
        System.out.print("Maximum profit:"+a[n][W]);
    }
}
