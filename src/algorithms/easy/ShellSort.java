package algorithms.easy;

public class ShellSort {
    public void sort(int[] a){
        int N= a.length;
        int h=1;
        while(h<N/3) h=h*3+1;
        while(h>=1){
            for(int i=h;i<N;i++){
                for (int j=i;j>=h && a[j]<a[j-h] ; j-=h){
                    int t= a[j];
                    a[j] = a[j-h];
                    a[j-h] = t;
                }
            }
            h=h/3;
        }
    }
}
