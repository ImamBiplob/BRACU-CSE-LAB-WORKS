import java.util.Scanner;
import java.util.Arrays;
public class task3 {
    public static int[] finalMerge(int a[],int b[]) {
        int n1=a.length, n2=b.length;
        int n=n1+n2;
        int c[] = new int [n];
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length) {
            if(a[i]<b[j]) {
                c[k]=a[i];
                i++;
            }
            else {
                c[k]=b[j];
                j++;
            }
            k++;
        }
        if(i!=a.length) {
            for(int x=i;x<a.length;x++){
                c[k]=a[i];
                i++;
                k++;
            }
        }
        if(j!=b.length) {
            for(int x=j;x<b.length;x++) {
                c[k]=b[j];
                j++;
                k++;
            }
        }
        return c;
    }
    public static void main( String[] args) {
        System.out.println("Enter the length of array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array values");
        for(int i=0;i<a.length;i++) {
            a[i]=sc.nextInt();
        }
        int mid = a.length/2;
        int ar1[] = new int[a.length/2];
        int ar2[] = new int[a.length-mid];
        for(int i=0;i<mid;i++) {
            ar1[i]=a[i];
        }
        for(int i=0;i<ar2.length;i++) {
            ar2[i] = a[i+mid];
        }
        MergeSort mt1 = new MergeSort(ar1);
        MergeSort mt2 = new MergeSort(ar2);
        mt1.start();
        mt2.start();
        try {
            mt1.join();
            mt2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a=finalMerge(mt1.returnArray(),mt2.returnArray());
        System.out.println("Sorted Array is: ");
        System.out.println(Arrays.toString(a));

    }
}

class MergeSort extends Thread {
    int[]a;
    MergeSort(int[] a){
        this.a=a;
    }
    public int[] returnArray() {
        return a;
    }
    @Override
    public void run() {
        a=mergeSort(a);
    }

    public static int[] mergeSort(int [] a){
        if (a.length>1){
            int mid = a.length/2;
            int ar1[] = new int [mid];
            int ar2[] =new int [a.length-mid];
            for(int i=0;i<mid;i++) {
                ar1[i]=a[i];
            }
            for(int i=0;i<ar2.length;i++) {
                ar2[i] = a[i+mid];
            }

            ar1=mergeSort(ar1);
            ar2=mergeSort(ar2);
            a=Merge(ar1,ar2);

        }
        return a;
    }
    public static int[] Merge(int a[],int b[]) {
        int n1=a.length, n2=b.length;
        int n=n1+n2;
        int c[] = new int [n];
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length) {
            if(a[i]<b[j]) {
                c[k]=a[i];
                i++;
            }
            else {
                c[k]=b[j];
                j++;
            }
            k++;
        }
        if(i!=a.length) {
            for(int x=i;x<a.length;x++){
                c[k]=a[i];
                i++;
                k++;
            }
        }
        if(j!=b.length) {
            for(int x=j;x<b.length;x++) {
                c[k]=b[j];
                j++;
                k++;
            }
        }
        return c;
    }

}
