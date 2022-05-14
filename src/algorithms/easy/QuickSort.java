package algorithms.easy;

public class QuickSort {

    public void sort(int[] a, int lo , int hi){
        if(hi<=lo) return;
        int j = partition(a,lo,hi);
        sort(a, lo,j-1);
        sort(a,j+1,hi);
    }
    private static int partition(int[] a, int lo , int hi ){
        int i =lo,j=hi+1;
        int v=a[lo];
        while(true){
            while(a[++i]<v) if(i==hi) break;
            while(a[--j]>v) if(j==hi) break;
            if(i>=j) break;
            int t =a[i];
            a[i] = a[j];
            a[j]=t;
        }
        int t=lo;
        lo=j;
        j=t;
        return j;
    }
}
