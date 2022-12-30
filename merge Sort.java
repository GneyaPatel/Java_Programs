import java.util.Scanner;

public class Merge {
    public static void main(String[] args){       
        int i,n;
        System.out.println("enter no of ele :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int []a=new int[10];
        System.out.println("enter elements:");
        for( i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        long begin = System.nanoTime();
        divide(a,0,n-1);

        System.out.println("\nsorted array:");  
        for( i=0;i<n;i++){
            System.out.print("  "+a[i]);
        }
        long end = System.nanoTime();
        long diff = end - begin;        
        System.out.println("\ntimecomplexity:"+diff);
    }
    
    public static void divide(int a[], int si, int ei){      
        if(si>=ei){
            return;
        }
        int mid= si+(ei-si)/2;
        divide(a,si,mid);
        divide(a,mid+1,ei);
        conquer(a,si,mid,ei);
    }
    
    public static void conquer(int a[], int si,int mid, int ei){
        int merged[] = new int[ei-si+1];
        int idx1=si;
        int idx2 = mid +1;
        int x=0;
        while(idx1<=mid && idx2<=ei){
            if(a[idx1]<=a[idx2]) {
                merged[x]=a[idx1];
                x++;idx1++;
            }else {
                merged[x]=a[idx2];
                x++;idx2++;
            }
        }
        while(idx1<=mid){
            merged[x]=a[idx1];
            x++;idx1++;
        }
        while(idx2<=ei){
            merged[x]=a[idx2];
            x++;idx2++;
        }
      
        for(int i=0, j=si;i<merged.length;i++,j++){
            a[j]=merged[i];
        }
    }
}

