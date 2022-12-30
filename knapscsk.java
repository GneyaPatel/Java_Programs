import java.util.*;
public class ks {
    public static void main(String[] args) {
        int n,i,u=0;
        double W,p=0,w1=0;
        double max;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num of object:");
        n=sc.nextInt();
        
        double w[]=new double[n];
        double v[]=new double[n];
        double x[]=new double[n];
        
        System.out.println("Enter the weight :");
        for(i=0;i<n;i++){
            w[i]=sc.nextDouble();
        }
        System.out.println("Enter the value :");
        for(i=0;i<n;i++){
            v[i]=sc.nextDouble();
        }
        double R[]=new double[n];
        for(i=0;i<n;i++){
            R[i]=v[i]/w[i];
        }
        System.out.print("Enter capacity:");
        W=sc.nextDouble();
        
        while(w1<W){
            max=0;
            for(i=0;i<n;i++){
                if(R[i]>max){
                    max = R[i];
                    u=i;
                }
            }
            if((w1+w[u])<=W){
                x[u]=1;
                w1=w1+w[u];
                p=p+v[u];
            }
            else{
                x[u]=(W-w1)/w[u];
                p=p+(v[u]*x[u]);
                w1=W;
            }
            R[u]=0;
        }
        System.out.println("fraction of object:");
        for(i=0;i<n;i++){
            System.out.print(x[i]+" ");
        }
        System.out.println("Total profit :"+p);
    }
    
}
