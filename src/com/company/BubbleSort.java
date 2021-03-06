package com.company;

import java.util.Arrays;

/**
 * @author yzy
 * @date 2021/2/24
 */
public class BubbleSort {

    public static void sort(int[] array) {
        //这里for循环表示总共需要比较多少轮
        for (int i = 1; i < array.length; i++) {
            //设定一个标记，若为true，则表示此次循环没有进行交换，也就是待排序列已经有序，排序已经完成。
            boolean flag = true;
            //这里for循环表示每轮比较参与的元素下标
            //对当前无序区间array[0......length-i]进行排序
            //j的范围很关键，这个范围是在逐步缩小的,因为每轮比较都会将最大的放在右边
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
            //第 i轮排序的结果为
            System.out.print("第" + i + "轮排序后的结果为:");
            display(array);
        }
    }


    //遍历显示数组
    public static void display(int[] array) {
        Arrays.stream(array).mapToObj(j -> j + " ").forEach(System.out::print);
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 8, 3, 5, 7, 6, 1, 9};
        //未排序数组顺序为
        System.out.println("未排序数组顺序为：");
        display(array);
        System.out.println("-----------------------");
        sort(array);
        System.out.println("-----------------------");
        System.out.println("经过冒泡排序后的数组顺序为：");
        display(array);
    }
}
