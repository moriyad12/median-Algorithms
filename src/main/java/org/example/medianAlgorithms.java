package org.example;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
        Random random = new Random();
        int randomIndex = left;
        if(n-1>0){
            randomIndex = left+random.nextInt(n-1);
        }
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
    public static int medianOfMedians(int[] data,int med){
        int n=data.length;
        if(n<=5){
            return naiveSort(data,med);
        }
        int[] medianOfGroups=new int[(int) Math.ceil(n/5.0)];
        int index=0;
        for(int i=0;i<n;i+=5){
            int[] group =new int[Math.min(5,n-i)];
            for(int j=i;j<i+5&&j<n;j++){
             group[j-i]=data[j];
            }
            medianOfGroups[index++]=medianOfMedians(group,(group.length-1)/2);
        }
        int ans=medianOfMedians(medianOfGroups,(medianOfGroups.length-1)/2);
        int [] rightData=new int[n];
        int [] leftData=new int[n];
        int r=0,l=0;
        boolean firstTime=true;
        for(int i=0;i<data.length;i++){
            if(data[i]<ans)
            {
                leftData[l++]=data[i];
            }
            else{
                if(ans==data[i]&&firstTime){
                    firstTime=false;
                    continue;
                }
                rightData[r++]=data[i];
            }

        }
        int[] newLeftData = new int[l];
        int[] newRightData = new int[r];
        System.arraycopy(leftData, 0, newLeftData, 0, l);
        System.arraycopy(rightData, 0, newRightData, 0, r);
        if(newLeftData.length==med) return ans;
        else if(newLeftData.length>med){
            return medianOfMedians(newLeftData,med);
        }
        else{
            return medianOfMedians(newRightData,med- newLeftData.length-1);
        }

    }
}
