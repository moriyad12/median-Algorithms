package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Random;

public class test {
    private int[] generateLargeRandomArrayList(int size) {
       int[] data = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            data[i]=random.nextInt(20_000_000) - 10_000_000;
        }
        return data;
    }
    @Test
    public void test5e7Data() {
        long naive=0,randomized=0,median=0;
        for(int i=0;i<10;i++){
            int[] data = generateLargeRandomArrayList(50_000_000);
            int med = 2500_000-1;
            int left = 0;
            int right = data.length - 1;
            int[] copyList = Arrays.copyOf(data, data.length);
            int[] copyList2 = Arrays.copyOf(data, data.length);
            long startTime1 = System.nanoTime();
            int expected = medianAlgorithms.naiveSort(copyList,med);
            long endTime1 = System.nanoTime();
            naive+=(endTime1 - startTime1);
            long startTime2 = System.nanoTime();
            int result = medianAlgorithms.randomizeDivideAndConquer(data, med, left, right);
            long endTime2 = System.nanoTime();
            randomized+= (endTime2 - startTime2);
            assertEquals(expected, result);
            long startTime3 = System.nanoTime();
            int result2 = medianAlgorithms.medianOfMedians(copyList2,med, left, right);
            long endTime3 = System.nanoTime();
            median+= (endTime3 - startTime3);
            assertEquals(expected, result2);}
        System.out.println("naive sort Execution Time: " + naive/10 + "ns");
        System.out.println("RandomizeDivideAndConquer Execution Time: " + randomized/10 + "ns");
        System.out.println("median of medians Execution Time: " + median/10 + "ns");
    }

    @Test
    public void test1e7Data() {
        long naive=0,randomized=0,median=0;
        for(int i=0;i<10;i++){
        int[] data = generateLargeRandomArrayList(10_000_000);
        int med = 5_000_000-1;
        int left = 0;
        int right = data.length - 1;
        int[] copyList = Arrays.copyOf(data, data.length);
        int[] copyList2 = Arrays.copyOf(data, data.length);
        long startTime1 = System.nanoTime();
        int expected = medianAlgorithms.naiveSort(copyList,med);
        long endTime1 = System.nanoTime();
        naive+=(endTime1 - startTime1);
        long startTime2 = System.nanoTime();
        int result = medianAlgorithms.randomizeDivideAndConquer(data, med, left, right);
        long endTime2 = System.nanoTime();
        randomized+= (endTime2 - startTime2);
        assertEquals(expected, result);
        long startTime3 = System.nanoTime();
        int result2 = medianAlgorithms.medianOfMedians(copyList2,med, left, right);
        long endTime3 = System.nanoTime();
         median+= (endTime3 - startTime3);
        assertEquals(expected, result2);}
        System.out.println("naive sort Execution Time: " + naive/10 + "ns");
        System.out.println("RandomizeDivideAndConquer Execution Time: " + randomized/10 + "ns");
        System.out.println("median of medians Execution Time: " + median/10 + "ns");
    }
    @Test
    public void test5e6Data() {
        long naive=0,randomized=0,median=0;
        for(int i=0;i<10;i++){
            int[] data = generateLargeRandomArrayList(50_000_00);
            int med = 2500_00-1;
            int left = 0;
            int right = data.length - 1;
            int[] copyList = Arrays.copyOf(data, data.length);
            int[] copyList2 = Arrays.copyOf(data, data.length);
            long startTime1 = System.nanoTime();
            int expected = medianAlgorithms.naiveSort(copyList,med);
            long endTime1 = System.nanoTime();
            naive+=(endTime1 - startTime1);
            long startTime2 = System.nanoTime();
            int result = medianAlgorithms.randomizeDivideAndConquer(data, med, left, right);
            long endTime2 = System.nanoTime();
            randomized+= (endTime2 - startTime2);
            assertEquals(expected, result);
            long startTime3 = System.nanoTime();
            int result2 = medianAlgorithms.medianOfMedians(copyList2,med, left, right);
            long endTime3 = System.nanoTime();
            median+= (endTime3 - startTime3);
            assertEquals(expected, result2);}
        System.out.println("naive sort Execution Time: " + naive/10 + "ns");
        System.out.println("RandomizeDivideAndConquer Execution Time: " + randomized/10 + "ns");
        System.out.println("median of medians Execution Time: " + median/10 + "ns");
    }
    @Test
    public void test1e6Data() {
        long naive=0,randomized=0,median=0;
        for(int i=0;i<10;i++){
            int[] data = generateLargeRandomArrayList(10_000_00);
            int med = 5_000_00-1;
            int left = 0;
            int right = data.length - 1;
            int[] copyList = Arrays.copyOf(data, data.length);
            int[] copyList2 = Arrays.copyOf(data, data.length);
            long startTime1 = System.nanoTime();
            int expected = medianAlgorithms.naiveSort(copyList,med);
            long endTime1 = System.nanoTime();
            naive+=(endTime1 - startTime1);
            long startTime2 = System.nanoTime();
            int result = medianAlgorithms.randomizeDivideAndConquer(data, med, left, right);
            long endTime2 = System.nanoTime();
            randomized+= (endTime2 - startTime2);
            assertEquals(expected, result);
            long startTime3 = System.nanoTime();
            int result2 = medianAlgorithms.medianOfMedians(copyList2,med, left, right);
            long endTime3 = System.nanoTime();
            median+= (endTime3 - startTime3);
            assertEquals(expected, result2);
            }
        System.out.println("naive sort Execution Time: " + naive/10 + "ns");
        System.out.println("RandomizeDivideAndConquer Execution Time: " + randomized/10 + "ns");
        System.out.println("median of medians Execution Time: " + median/10 + "ns");
    }
    @Test
    public void test1e5Data() {
        long naive=0,randomized=0,median=0;
        for(int i=0;i<10;i++){
            int[] data = generateLargeRandomArrayList(100_000);
            int med = 50_000-1;
            int left = 0;
            int right = data.length - 1;
            int[] copyList = Arrays.copyOf(data, data.length);
            int[] copyList2 = Arrays.copyOf(data, data.length);
            long startTime1 = System.nanoTime();
            int expected = medianAlgorithms.naiveSort(copyList,med);
            long endTime1 = System.nanoTime();
            naive+=(endTime1 - startTime1);
            long startTime2 = System.nanoTime();
            int result = medianAlgorithms.randomizeDivideAndConquer(data, med, left, right);
            long endTime2 = System.nanoTime();
            randomized+= (endTime2 - startTime2);
            assertEquals(expected, result);
            long startTime3 = System.nanoTime();
            int result2 = medianAlgorithms.medianOfMedians(copyList2,med, left, right);
            long endTime3 = System.nanoTime();
            median+= (endTime3 - startTime3);
            assertEquals(expected, result2);}
        System.out.println("naive sort Execution Time: " + naive/10 + "ns");
        System.out.println("RandomizeDivideAndConquer Execution Time: " + randomized/10 + "ns");
        System.out.println("median of medians Execution Time: " + median/10 + "ns");
    }
    @Test
    public void test1e4Data() {
        long naive=0,randomized=0,median=0;
        for(int i=0;i<10;i++){
            int[] data = generateLargeRandomArrayList(10_000);
            int med = 5_000-1;
            int left = 0;
            int right = data.length - 1;
            int[] copyList = Arrays.copyOf(data, data.length);
            int[] copyList2 = Arrays.copyOf(data, data.length);
            long startTime1 = System.nanoTime();
            int expected = medianAlgorithms.naiveSort(copyList,med);
            long endTime1 = System.nanoTime();
            naive+=(endTime1 - startTime1);
            long startTime2 = System.nanoTime();
            int result = medianAlgorithms.randomizeDivideAndConquer(data, med, left, right);
            long endTime2 = System.nanoTime();
            randomized+= (endTime2 - startTime2);
            assertEquals(expected, result);
            long startTime3 = System.nanoTime();
            int result2 = medianAlgorithms.medianOfMedians(copyList2,med, left, right);
            long endTime3 = System.nanoTime();
            median+= (endTime3 - startTime3);
            assertEquals(expected, result2);}
        System.out.println("naive sort Execution Time: " + naive/10 + "ns");
        System.out.println("RandomizeDivideAndConquer Execution Time: " + randomized/10 + "ns");
        System.out.println("median of medians Execution Time: " + median/10 + "ns");
    }
    @Test
    public void test1e3Data() {
        long naive=0,randomized=0,median=0;
        for(int i=0;i<10;i++){
            int[] data = generateLargeRandomArrayList(1000);
            int med = 500-1;
            int left = 0;
            int right = data.length - 1;
            int[] copyList = Arrays.copyOf(data, data.length);
            int[] copyList2 = Arrays.copyOf(data, data.length);
            long startTime1 = System.nanoTime();
            int expected = medianAlgorithms.naiveSort(copyList,med);
            long endTime1 = System.nanoTime();
            naive+=(endTime1 - startTime1);
            long startTime2 = System.nanoTime();
            int result = medianAlgorithms.randomizeDivideAndConquer(data, med, left, right);
            long endTime2 = System.nanoTime();
            randomized+= (endTime2 - startTime2);
            assertEquals(expected, result);
            long startTime3 = System.nanoTime();
            int result2 = medianAlgorithms.medianOfMedians(copyList2,med, left, right);
            long endTime3 = System.nanoTime();
            median+= (endTime3 - startTime3);
            assertEquals(expected, result2);}
        System.out.println("naive sort Execution Time: " + naive/10 + "ns");
        System.out.println("RandomizeDivideAndConquer Execution Time: " + randomized/10 + "ns");
        System.out.println("median of medians Execution Time: " + median/10 + "ns");
    }
    @Test
    public void test1e2Data() {
        long naive=0,randomized=0,median=0;
        for(int i=0;i<10;i++){
            int[] data = generateLargeRandomArrayList(100);
            int med = 50-1;
            int left = 0;
            int right = data.length - 1;
            int[] copyList = Arrays.copyOf(data, data.length);
            int[] copyList2 = Arrays.copyOf(data, data.length);
            long startTime1 = System.nanoTime();
            int expected = medianAlgorithms.naiveSort(copyList,med);
            long endTime1 = System.nanoTime();
            naive+=(endTime1 - startTime1);
            long startTime2 = System.nanoTime();
            int result = medianAlgorithms.randomizeDivideAndConquer(data, med, left, right);
            long endTime2 = System.nanoTime();
            randomized+= (endTime2 - startTime2);
            assertEquals(expected, result);
            long startTime3 = System.nanoTime();
            int result2 = medianAlgorithms.medianOfMedians(copyList2,med, left, right);
            long endTime3 = System.nanoTime();
            median+= (endTime3 - startTime3);
            assertEquals(expected, result2);}
        System.out.println("naive sort Execution Time: " + naive/10 + "ns");
        System.out.println("RandomizeDivideAndConquer Execution Time: " + randomized/10 + "ns");
        System.out.println("median of medians Execution Time: " + median/10 + "ns");
    }
    @Test
    public void test1e1Data() {
        int[] data = generateLargeRandomArrayList(10);
        int med = 5-1;
        int left = 0;
        int right = data.length - 1;
        int[] copyList = Arrays.copyOf(data, data.length);
        int[] copyList2 = Arrays.copyOf(data, data.length);
        long startTime1 = System.nanoTime();
        int expected = medianAlgorithms.naiveSort(copyList,med);
        long endTime1 = System.nanoTime();
        System.out.println("naive sort Execution Time: " + (endTime1 - startTime1) + "ns");
        long startTime2 = System.nanoTime();
        int result = medianAlgorithms.randomizeDivideAndConquer(data, med, left, right);
        long endTime2 = System.nanoTime();
        System.out.println("RandomizeDivideAndConquer Execution Time: " + (endTime2 - startTime2) + "ns");
        assertEquals(expected, result);
        long startTime3 = System.nanoTime();
        int result2 = medianAlgorithms.medianOfMedians(copyList2,med, left, right);
        long endTime3 = System.nanoTime();
        System.out.println("median of medians Execution Time: " + (endTime3 - startTime3) + "ns");
        assertEquals(expected, result2);
    }
    @Test
    public void test1e0Data() {
        long naive=0,randomized=0,median=0;
        for(int i=0;i<10;i++){
            int[] data = generateLargeRandomArrayList(1);
            int med =0;
            int left = 0;
            int right = data.length - 1;
            int[] copyList = Arrays.copyOf(data, data.length);
            int[] copyList2 = Arrays.copyOf(data, data.length);
            long startTime1 = System.nanoTime();
            int expected = medianAlgorithms.naiveSort(copyList,med);
            long endTime1 = System.nanoTime();
            naive+=(endTime1 - startTime1);
            long startTime2 = System.nanoTime();
            int result = medianAlgorithms.randomizeDivideAndConquer(data, med, left, right);
            long endTime2 = System.nanoTime();
            randomized+= (endTime2 - startTime2);
            assertEquals(expected, result);
            long startTime3 = System.nanoTime();
            int result2 = medianAlgorithms.medianOfMedians(copyList2,med, left, right);
            long endTime3 = System.nanoTime();
            median+= (endTime3 - startTime3);
            assertEquals(expected, result2);}
        System.out.println("naive sort Execution Time: " + naive/10 + "ns");
        System.out.println("RandomizeDivideAndConquer Execution Time: " + randomized/10 + "ns");
        System.out.println("median of medians Execution Time: " + median/10 + "ns");
    }

}
