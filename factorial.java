import java.util.*;

public class Fact_recursive {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("enter any no: ");
        int n=sc.nextInt();
        long start=System.nanoTime();

        int fact=factorial(n);
        System.out.println("factorial of "+n+" is "+fact);
        
        long end=System.nanoTime();
        System.out.println("time taken : "+(end-start));
    }
    
    public static int factorial(int n){
        if(n==0 || n==1)
            return 1;
        else
            return n*factorial(n-1);
    }
}


import java.util.*;

public class Fact_Itrative {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("enter any no :");
        int n=sc.nextInt();
        int fact=1;       
        long start=System.nanoTime();
        if(n==1 || n==0)
            System.out.println("factorial of "+n+" is "+fact);
        else{ for(int i=2;i<=n;i++){
                 fact *= i;
              }
            System.out.println("factorial of "+n+" is "+fact);
        }       
        long end=System.nanoTime();
        System.out.println("time taken : "+(end-start));
    }
}