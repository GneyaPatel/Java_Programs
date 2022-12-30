import java.util.Scanner;
public class MCM {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of matrix : ");
        int n = sc.nextInt();
        int []p = new int[n+1];
        System.out.print("Enter dimension: ");
        for(int i=0;i<n+1;i++){
           p[i]=sc.nextInt();
        }
        mcm(p,n);      
    }
    public static void mcm(int p[],int n){     
        int m[][]=new int[n+2][n+2];
        int s[][]=new int[n+2][n+2];
        for(int i=1;i<=n;i++){
            m[i][i]=0;
        }
       
        for(int l=2;l<=n;l++){
            for(int i=1;i<=n-l+1;i++){
                int j=i+l-1;
                m[i][j]=100000;
                for(int k=i;k<=j-1;k++){
                    int q = m[i][k] + m[k+1][j] + p[i-1]*p[j]*p[k];
                    if(q<m[i][j]){
                    m[i][j]=q;
                    s[i][j]=k;
                    }
                }
            }
        }
        for(int x=1;x<=n;x++){
            for(int y=1;y<=n;y++){
                System.out.print(m[x][y]+"  ");
            }
            System.out.println("");
        }
        System.out.println("no of multiplication : "+m[1][n]);
        printm(s,1,n);       
    }
    public static void printm(int s[][],int i,int j){
        if (i == j){
            System.out.print("A"+(i));
        }
        else{
            System.out.print("(");
            printm(s,i,s[i][j]);
            printm(s,s[i][j]+1,j);
            System.out.print(")");                   
        }
    }
}
