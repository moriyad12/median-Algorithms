package org.example;
import java.util.Arrays;
import java.util.Random;

public class medianAlgorithms {
    public static int naiveSort(int[] data,int med){
        Arrays.sort(data);
        return  data[med];
    }
    public static void swap(int[] data, int i, int j){
        int temp=data[i];
        data[i]=data[j];
        data[j]=temp;
    }
    public static int randomizeDivideAndConquer(int[] data,int med,int left ,int right){
        int n=right-left+1;
        if(n==1){
            return data[left];
        }
        Random random = new Random();
        int randomIndex = left+random.nextInt(n-1);
        swap(data,left,randomIndex);
        int j=left;
        for(int i=left+1;i<right+1;i++){
            if(data[i]<=data[left]){
                j++;
                swap(data,j,i);
            }
        }
       swap(data,j,left);
        if(j==med) return data[med];
        else if(j<med) return randomizeDivideAndConquer(data,med,j+1,right);
        else return randomizeDivideAndConquer(data,med,left,j-1);
    }
    public static int medianOfMedians(int[] data,int med,int left ,int right){
        int n=right-left+1;
        while ((right-left+1)%5!=0){
            for(int j=left+1;j<=right;j++)
            {
                if(data[left]>data[j])
                {
                    swap(data,j,left);
                }
            }
            if(left==med)
                return data[left];
            left=left+1;
        }
        n=right-left+1;
        int g=n/5;
       for (int j=left;j<=left+g-1;j++){
           int[] arr={data[j],data[j+g],data[j+2*g],data[j+3*g],data[j+4*g]};
           Arrays.sort(arr);
           for (int u=0;u<5;u++){
               data[j+u*g]=arr[u];
           }
       }
        int ans=medianOfMedians(data,left+2*g+(g/2),left+2*g,left+3*g-1);
        int ansIndex = 0;
        for (int i=left;i<=right+1;i++){
            if (data[i]==ans){
                ansIndex=i;
                break;
            }
        }
        swap(data,left,ansIndex);
        int j=left;
        for(int i=left+1;i<right+1;i++){
            if(data[i]<=data[left]){
                j++;
                swap(data,j,i);
            }
        }
        swap(data,j,left);
        if(j==med) return data[med];
        else if(j<med) return medianOfMedians(data,med,j+1,right);
        else return medianOfMedians(data,med,left,j-1);
    }
}
