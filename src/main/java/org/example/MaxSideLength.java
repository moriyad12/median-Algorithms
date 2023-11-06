package org.example;

import java.awt.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class MaxSideLength  {
    class sorByX implements Comparator<Point> {
        @Override
        public int compare(Point X, Point Y) {
            if(X.x != Y.x)
                return Integer.compare(X.x, Y.x);
            else return  Integer.compare(X.y, Y.y);
        }
    }
    class sorByY implements Comparator<Point> {
        @Override
        public int compare(Point X, Point Y) {
            if(X.y != Y.y)
                return Integer.compare(X.y, Y.y);
            else return  Integer.compare(X.x, Y.x);
        }
    }
    static long calculateDistance(Point X, Point Y){
       return Math.max(Math.abs(X.x-Y.x), Math.abs(X.y-Y.y));
    }
    long smallestDistance(ArrayList<Point> points, int left, int right){
        int n= right-left+1;
        if(n<=3){
           long minimum=(long)1e18;
           for(int i=left;i<right+1;i++){
               for(int j=i+1;j<right+1;j++)
               {
                   minimum=Math.min(minimum,calculateDistance(points.get(i), points.get(j)));
               }
           }
           return minimum;
        }
        int mid=left+n/2;
        long ans1=smallestDistance(points,left,mid-1);
        long ans2=smallestDistance(points,mid,right);
        long ans=Math.min(ans1,ans2);
        ArrayList<Point> nearbyPoints = new ArrayList<>();
        int l=mid,r=mid+1;
        while(l>=left&&(points.get(mid).x- points.get(l).x<=ans)){
            nearbyPoints.add(points.get(l));
            l--;
        }
        while(r<=right&&(points.get(r).x-points.get(mid).x<=ans)){
            nearbyPoints.add(points.get(r));
            r++;
        }
        Collections.sort(nearbyPoints, new sorByY());
        for (int i=0;i<nearbyPoints.size();i++){
            for (int j=i+1;j<nearbyPoints.size();j++){
                if(nearbyPoints.get(j).y- nearbyPoints.get(i).y>ans)
                    break;
                ans=Math.min(ans,calculateDistance(nearbyPoints.get(i), nearbyPoints.get(j)));
            }
        }
        return ans;
    }

    public long solve(String inputFile) {
        try {
        File input_file = new File(inputFile);
        Scanner scanner = new Scanner(input_file);
        ArrayList<Point> points = new ArrayList<>();
        int n;
        n=scanner.nextInt();
        for(int i=0;i<n;i++){
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            points.add(new Point(x, y));
        }
        Collections.sort(points,new sorByX());
        return smallestDistance(points,0,n-1);} catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }


}