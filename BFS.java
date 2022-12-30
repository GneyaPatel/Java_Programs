import java.util.Scanner;

public class BFS{  
    static int v[]=new int[20];
    static int G[][]=new int[20][20];
    static int n,u;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of nodes :");
        n=sc.nextInt();
               
        System.out.println("Enter 1 if node are adjacent otherwise 0");
        System.out.println("Enter graph:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                G[i][j]=sc.nextInt();
            }
        }
        bfsearch();        
    }
    public static void bfsearch(){
            for(int i=0;i<n;i++){
                v[i]=0;  
            }
            for(int i=0;i<n;i++)
            {
                if(v[i]== 0)
                bfs(i);
            }
        }
    public static void bfs(int i)
    {
        int r=0,f=0,j;
        int queue[] = new int[n+1];
        v[i]=1;
         
        queue[r]=i;
        r++;
        if(f==-1)
        {
            f=0;
        }
        while(f!=r)
        {
            u=queue[f];
            System.out.println("visited node:"+(u+1));  
            f+=1;
            for(j=0;j<n;j++){
                if(G[u][j] == 1 && v[j]==0){
                       v[j]=1;                    
                       queue[r]=j;
                       r++;  
                }
            }
            for(i=f;i<r;i++){
                System.out.println("Queue :"+(queue[i]+1));
            }
        }
    }
}
