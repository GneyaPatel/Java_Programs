PRIM:---------------------------------------------

import java.util.*;

public class prim {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of nodes :");
        n=sc.nextInt();
        int a[][]=new int[n][n];
        int V[]=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    System.out.println("Edge:"+(i+1)+"-"+(j+1)+" cost = 9");
                    a[i][j]=9;
                }
                else{
                    System.out.print("Edge:"+(i+1)+"-"+(j+1)+" cost = ");
                    a[i][j]=sc.nextInt();
                }
            }
        }
        System.out.println("");
       
        int s=0;
        V[s]=1;
        int sum=0,u=0,v=0;
        while(s<n-1){
        int min=9;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                 if(V[i]==1){                                    
                     if(a[i][j]<min){
                         min=a[i][j];
                         u=i;
                         v=j;
              }                                              
            }
          }          
        }
        if((V[u]==0&&V[v]==1)||(V[u]==1&&V[v]==0)){
               sum +=a[u][v];
               System.out.println("edge :"+u+"-"+v+" cost="+a[u][v]);
               V[u]=V[v]=1;
               s++;
           }
        a[u][v]=a[v][u]=9;
      }
        System.out.println("Total cost:"+sum);
    }
}
