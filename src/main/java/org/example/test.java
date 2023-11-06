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
    public void testRandomizeDivideAndConquer1e8Data() {
        int[] data = generateLargeRandomArrayList(100_000_000);
        int med = 50_000_000-1;
        int left = 0;
        int right = data.length - 1;
        int[] copyList = Arrays.copyOf(data, data.length);
        int[] copyList2 = Arrays.copyOf(data, data.length);
        long startTime1 = System.currentTimeMillis();
        int expected = medianAlgorithms.naiveSort(copyList,med);
        long endTime1 = System.currentTimeMillis();
        System.out.println("naive sort Execution Time: " + (endTime1 - startTime1) + "ms");
        long startTime2 = System.currentTimeMillis();
        int result = medianAlgorithms.randomizeDivideAndConquer(data, med, left, right);
        long endTime2 = System.currentTimeMillis();
        System.out.println("RandomizeDivideAndConquer Execution Time: " + (endTime2 - startTime2) + "ms");
        assertEquals(expected, result);
        long startTime3 = System.currentTimeMillis();
        int result2 = medianAlgorithms.medianOfMedians(copyList2,med);
        long endTime3 = System.currentTimeMillis();
        System.out.println("median of medians Execution Time: " + (endTime3 - startTime3) + "ms");
        assertEquals(expected, result2);
    }

    @Test
    public void testRandomizeDivideAndConquer1e7Data() {
        int[] data = generateLargeRandomArrayList(10_000_000);
        int med = 5_000_000-1;
        int left = 0;
        int right = data.length - 1;
        int[] copyList = Arrays.copyOf(data, data.length);
        int[] copyList2 = Arrays.copyOf(data, data.length);
        long startTime1 = System.currentTimeMillis();
        int expected = medianAlgorithms.naiveSort(copyList,med);
        long endTime1 = System.currentTimeMillis();
        System.out.println("naive sort Execution Time: " + (endTime1 - startTime1) + "ms");
        long startTime2 = System.currentTimeMillis();
        int result = medianAlgorithms.randomizeDivideAndConquer(data, med, left, right);
        long endTime2 = System.currentTimeMillis();
        System.out.println("RandomizeDivideAndConquer Execution Time: " + (endTime2 - startTime2) + "ms");
        assertEquals(expected, result);
        long startTime3 = System.currentTimeMillis();
        int result2 = medianAlgorithms.medianOfMedians(copyList2,med);
        long endTime3 = System.currentTimeMillis();
        System.out.println("median of medians Execution Time: " + (endTime3 - startTime3) + "ms");
        assertEquals(expected, result2);
    }
    @Test
    public void testRandomizeDivideAndConquer1e6Data() {
        int[] data = generateLargeRandomArrayList(1_000_000);
        int med = 500_000-1;
        int left = 0;
        int right = data.length - 1;
        int[] copyList = Arrays.copyOf(data, data.length);
        int[] copyList2 = Arrays.copyOf(data, data.length);
        long startTime1 = System.currentTimeMillis();
        int expected = medianAlgorithms.naiveSort(copyList,med);
        long endTime1 = System.currentTimeMillis();
        System.out.println("naive sort Execution Time: " + (endTime1 - startTime1) + "ms");
        long startTime2 = System.currentTimeMillis();
        int result = medianAlgorithms.randomizeDivideAndConquer(data, med, left, right);
        long endTime2 = System.currentTimeMillis();
        System.out.println("RandomizeDivideAndConquer Execution Time: " + (endTime2 - startTime2) + "ms");
        assertEquals(expected, result);
        long startTime3 = System.currentTimeMillis();
        int result2 = medianAlgorithms.medianOfMedians(copyList2,med);
        long endTime3 = System.currentTimeMillis();
        System.out.println("median of medians Execution Time: " + (endTime3 - startTime3) + "ms");
        assertEquals(expected, result2);
    }
    @Test
    public void testRandomizeDivideAndConquer1e5Data() {
        int[] data = generateLargeRandomArrayList(100_000);
        int med = 50_000-1;
        int left = 0;
        int right = data.length - 1;
        int[] copyList = Arrays.copyOf(data, data.length);
        int[] copyList2 = Arrays.copyOf(data, data.length);
        long startTime1 = System.currentTimeMillis();
        int expected = medianAlgorithms.naiveSort(copyList,med);
        long endTime1 = System.currentTimeMillis();
        System.out.println("naive sort Execution Time: " + (endTime1 - startTime1) + "ms");
        long startTime2 = System.currentTimeMillis();
        int result = medianAlgorithms.randomizeDivideAndConquer(data, med, left, right);
        long endTime2 = System.currentTimeMillis();
        System.out.println("RandomizeDivideAndConquer Execution Time: " + (endTime2 - startTime2) + "ms");
        assertEquals(expected, result);
        long startTime3 = System.currentTimeMillis();
        int result2 = medianAlgorithms.medianOfMedians(copyList2,med);
        long endTime3 = System.currentTimeMillis();
        System.out.println("median of medians Execution Time: " + (endTime3 - startTime3) + "ms");
        assertEquals(expected, result2);
    }
    @Test
    public void testRandomizeDivideAndConquer1e4Data() {
        int[] data = generateLargeRandomArrayList(10_000);
        int med = 5_000-1;
        int left = 0;
        int right = data.length - 1;
        int[] copyList = Arrays.copyOf(data, data.length);
        int[] copyList2 = Arrays.copyOf(data, data.length);
        long startTime1 = System.currentTimeMillis();
        int expected = medianAlgorithms.naiveSort(copyList,med);
        long endTime1 = System.currentTimeMillis();
        System.out.println("naive sort Execution Time: " + (endTime1 - startTime1) + "ms");
        long startTime2 = System.currentTimeMillis();
        int result = medianAlgorithms.randomizeDivideAndConquer(data, med, left, right);
        long endTime2 = System.currentTimeMillis();
        System.out.println("RandomizeDivideAndConquer Execution Time: " + (endTime2 - startTime2) + "ms");
        assertEquals(expected, result);
        long startTime3 = System.currentTimeMillis();
        int result2 = medianAlgorithms.medianOfMedians(copyList2,med);
        long endTime3 = System.currentTimeMillis();
        System.out.println("median of medians Execution Time: " + (endTime3 - startTime3) + "ms");
        assertEquals(expected, result2);
    }
    @Test
    public void testRandomizeDivideAndConquer1e3Data() {
        int[] data = generateLargeRandomArrayList(1000);
        int med = 500-1;
        int left = 0;
        int right = data.length - 1;
        int[] copyList = Arrays.copyOf(data, data.length);
        int[] copyList2 = Arrays.copyOf(data, data.length);
        long startTime1 = System.currentTimeMillis();
        int expected = medianAlgorithms.naiveSort(copyList,med);
        long endTime1 = System.currentTimeMillis();
        System.out.println("naive sort Execution Time: " + (endTime1 - startTime1) + "ms");
        long startTime2 = System.currentTimeMillis();
        int result = medianAlgorithms.randomizeDivideAndConquer(data, med, left, right);
        long endTime2 = System.currentTimeMillis();
        System.out.println("RandomizeDivideAndConquer Execution Time: " + (endTime2 - startTime2) + "ms");
        assertEquals(expected, result);
        long startTime3 = System.currentTimeMillis();
        int result2 = medianAlgorithms.medianOfMedians(copyList2,med);
        long endTime3 = System.currentTimeMillis();
        System.out.println("median of medians Execution Time: " + (endTime3 - startTime3) + "ms");
        assertEquals(expected, result2);
    }
    @Test
    public void testRandomizeDivideAndConquer1e2Data() {
        int[] data = generateLargeRandomArrayList(100);
        int med = 50-1;
        int left = 0;
        int right = data.length - 1;
        int[] copyList = Arrays.copyOf(data, data.length);
        int[] copyList2 = Arrays.copyOf(data, data.length);
        long startTime1 = System.currentTimeMillis();
        int expected = medianAlgorithms.naiveSort(copyList,med);
        long endTime1 = System.currentTimeMillis();
        System.out.println("naive sort Execution Time: " + (endTime1 - startTime1) + "ms");
        long startTime2 = System.currentTimeMillis();
        int result = medianAlgorithms.randomizeDivideAndConquer(data, med, left, right);
        long endTime2 = System.currentTimeMillis();
        System.out.println("RandomizeDivideAndConquer Execution Time: " + (endTime2 - startTime2) + "ms");
        assertEquals(expected, result);
        long startTime3 = System.currentTimeMillis();
        int result2 = medianAlgorithms.medianOfMedians(copyList2,med);
        long endTime3 = System.currentTimeMillis();
        System.out.println("median of medians Execution Time: " + (endTime3 - startTime3) + "ms");
        assertEquals(expected, result2);
    }
    @Test
    public void testRandomizeDivideAndConquer1e1Data() {
        int[] data = generateLargeRandomArrayList(10);
        int med = 5-1;
        int left = 0;
        int right = data.length - 1;
        int[] copyList = Arrays.copyOf(data, data.length);
        int[] copyList2 = Arrays.copyOf(data, data.length);
        long startTime1 = System.currentTimeMillis();
        int expected = medianAlgorithms.naiveSort(copyList,med);
        long endTime1 = System.currentTimeMillis();
        System.out.println("naive sort Execution Time: " + (endTime1 - startTime1) + "ms");
        long startTime2 = System.currentTimeMillis();
        int result = medianAlgorithms.randomizeDivideAndConquer(data, med, left, right);
        long endTime2 = System.currentTimeMillis();
        System.out.println("RandomizeDivideAndConquer Execution Time: " + (endTime2 - startTime2) + "ms");
        assertEquals(expected, result);
        long startTime3 = System.currentTimeMillis();
        int result2 = medianAlgorithms.medianOfMedians(copyList2,med);
        long endTime3 = System.currentTimeMillis();
        System.out.println("median of medians Execution Time: " + (endTime3 - startTime3) + "ms");
        assertEquals(expected, result2);
    }
    @Test
    public void testRandomizeDivideAndConquer1e0Data() {
        int[] data = generateLargeRandomArrayList(1);
        int med = 0;
        int left = 0;
        int right = data.length - 1;
        int[] copyList = Arrays.copyOf(data, data.length);
        int[] copyList2 = Arrays.copyOf(data, data.length);
        long startTime1 = System.currentTimeMillis();
        int expected = medianAlgorithms.naiveSort(copyList,med);
        long endTime1 = System.currentTimeMillis();
        System.out.println("naive sort Execution Time: " + (endTime1 - startTime1) + "ms");
        long startTime2 = System.currentTimeMillis();
        int result = medianAlgorithms.randomizeDivideAndConquer(data, med, left, right);
        long endTime2 = System.currentTimeMillis();
        System.out.println("RandomizeDivideAndConquer Execution Time: " + (endTime2 - startTime2) + "ms");
        assertEquals(expected, result);
        long startTime3 = System.currentTimeMillis();
        int result2 = medianAlgorithms.medianOfMedians(copyList2,med);
        long endTime3 = System.currentTimeMillis();
        System.out.println("median of medians Execution Time: " + (endTime3 - startTime3) + "ms");
        assertEquals(expected, result2);
    }

}