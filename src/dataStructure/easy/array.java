package dataStructure.easy;

import java.lang.reflect.Array;

public class array {
    public static void main(String[] args){
        int[] arr = new int[5];
        arr[0]=0;
        arr[0]=0;
        arr[0]=0;
        arr[0]=0;
        arr[0]=0;
        arr[0]=0;
        arr[0]=0;

    }
    public int[] reverse(int[] arr, int start, int end){
        while(start<end){
            int temp= arr[end];
            arr[start]=arr[end];
            arr[end]=temp;
        }
        return arr;
    }
    public int minimum(int[] arr, int start , int end){
        int min = arr[start];
        while(start<end){
            if (arr[start] < min){
                min=arr[start];
            }
            start++;
        }
        return min;
    }
    public int secondmax(int[] arr){
        int max= Integer.MIN_VALUE;
        int secndmx=Integer.MIN_VALUE;
        for (int i=0 ; i<arr.length ;i++){
            if(arr[i]>max){
                secndmx=max;
                max=arr[i];
            }else if (arr[i]>secndmx && arr[i]!=max){
                secndmx=max;
            }
        }
        return secndmx;
    }
    public int[] zeroes(int[] arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
        return arr;
    }
}
