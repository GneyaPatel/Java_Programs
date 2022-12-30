import java.util.*;
public class Heap {
    static void heapsort(int a[], int n){
        for (int i = n/2 - 1; i >= 0; i--){
            heapify(a, n, i);
        }
        for (int i = n - 1; i > 0; i--){
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
            heapify(a, i, 0);
        }
    }

    static void heapify(int a[], int n, int i){
        int largest = i;
        int l = 2 * i;
        int r = 2 * i + 1;
        if (l < n && a[l] > a[largest]){
            largest = l;
        }
        if (r < n && a[r] > a[largest]){
            largest = r;
        }
        if (largest != i) {
            int swap = a[i];
            a[i] = a[largest];
            a[largest] = swap;
            heapify(a, n, largest);
        }
    }

    static void printArray(int a[], int n) {
        for (int i = 0; i < n; ++i){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int i,n;
        System.out.println("enter no of ele :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int []a=new int[10];
        System.out.println("enter elements:");
        for( i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        heapsort(a, n);
        System.out.println("Sorted array is");
        printArray(a, n);
    }
}
