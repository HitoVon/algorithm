import java.util.Arrays;

/**
 * 各种排序算法
 *
 * @author fenghaitao on 2019/11/14
 */
public class Sorting {
    /**
     * 冒泡排序
     * @param nums
     * @return
     */
    public int[] bubbleSort(int[] nums) {
        return nums;
    }

    /**
     * 选择排序
     * @param nums
     * @return
     */
    public int[] selectionSort(int[] nums) {
        return nums;
    }

    /**
     * 插入排序
     * @param nums
     * @return
     */
    public int[] insertionSort(int[] nums) {
        return nums;
    }

    /**
     * 希尔排序
     * @param nums
     * @return
     */
    public int[] shellSort(int[] nums) {
        return nums;
    }

    /**
     * 归并排序
     * @param nums
     * @return
     */
    public int[] mergeSort(int[] nums) {
        return nums;
    }

    /**
     * 快速排序
     * @param nums
     * @return
     */
    public int[] quickSort(int[] nums) {
        return nums;
    }

    /**
     * 堆排序
     * @param nums
     * @return
     */
    public int[] heapSort(int[] nums) {
        return nums;
    }

    /**
     * 桶排序
     * @param nums
     * @return
     */
    public int[] bucketSort(int[] nums) {
        return nums;
    }

    /**
     * 基数排序
     * @param nums
     * @return
     */
    public int[] radixSort(int[] nums) {
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 5, 9, 2, 3, 7, 8, 6};
        Sorting instance = new Sorting();
        System.out.println("bubbleSort result=" + Arrays.toString(instance.bubbleSort(nums)));
        System.out.println("selectionSort result=" + Arrays.toString(instance.selectionSort(nums)));
        System.out.println("insertionSort result=" + Arrays.toString(instance.insertionSort(nums)));
        System.out.println("shellSort result=" + Arrays.toString(instance.shellSort(nums)));
        System.out.println("mergeSort result=" + Arrays.toString(instance.mergeSort(nums)));
        System.out.println("quickSort result=" + Arrays.toString(instance.quickSort(nums)));
        System.out.println("heapSort result=" + Arrays.toString(instance.heapSort(nums)));
        System.out.println("bucketSort result=" + Arrays.toString(instance.bucketSort(nums)));
        System.out.println("radixSort result=" + Arrays.toString(instance.radixSort(nums)));
    }
}