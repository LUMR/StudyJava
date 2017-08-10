package algorithm.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * 快速排序算法
 */
public class FastSorting {
    private List<Integer> list;

    public FastSorting(List<Integer> list) {
        this.list = list;
        sort();
    }

    public List<Integer> getArray() {
        return list;
    }

    /**
     * 排序入口
     */
    private void sort() {
        sort(0, list.size() - 1);
    }

    /**
     * 递归排序
     * @param begin 要排序的区间起始元素坐标
     * @param end 要排序的区间终止元素坐标
     */
    private void sort(int begin, int end) {
        int diff = end - begin;
        if (diff == 0)
            return;
        if (diff == 1) {
            if (list.get(begin) > list.get(end))
                exchange(begin, end);
            return;
        }

        int height = list.get(end);
        int i = begin;
        for (int j = end - 1; i < j; i++) {
            if (list.get(i) >= height) {
                for (; j > i; j--) {
                    if (list.get(j) <= height) {
                        exchange(i, j);
                        break;
                    }
                }
            }
        }
        synchronized (this) {//防止多线程时互相干扰
            list.add(i, list.get(end));
            list.remove(end + 1);
        }

        sort(begin, i);
        sort(i + 1, end);
    }


    /**
     * 交换数组元素的位置
     *
     * @param i 元素1
     * @param k 元素2
     */
    private void exchange(int i, int k) {
        Integer temp;
        temp = list.get(i);
        list.set(i, list.get(k));
        list.set(k, temp);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(18);
        list.add(18);
        list.add(6);
        list.add(6);
        list.add(24);
        list.add(24);
        list.add(10);
        list.add(10);
        list.add(8);
        FastSorting sorting = new FastSorting(list);
        System.out.println(sorting.getArray());
    }
}
