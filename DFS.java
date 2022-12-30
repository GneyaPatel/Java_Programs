import java.util.Scanner;

public class dfs {
   
 
    static  int v[] = new int[10];
    static  int a[][]=new int[10][10];
    static int n;
    public static void main(String[] args)
    {
 
   
       
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of nodes :");
        n=sc.nextInt();
         
       
        System.out.println("enter 1 if node are adjacent otherwise 0");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("Edge:"+(i+1)+"-"+(j+1)+" value = ");
                a[i][j]=sc.nextInt();
            }
        }
        dfsearch();
       
    }
   
   
       public static void dfsearch()
        {
           
             for(int i=0;i<n;i++)
             {
                v[i]=0;
               
             }
             for(int i=0;i<n;i++)
             {
                 if(v[i]== 0)
                dfs(i);
             }
        }
        public static void dfs( int i)
        {
             
            v[i]=1;
           
            System.out.println("visited node:"+(i+1));
           
               for(int j=0;j<n;j++)
           {
               if( a[i][j] == 1 && v[j] == 0)
               {
                   dfs(j);
               }
                   
           }
            }
       
        }

  