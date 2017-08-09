package algorithm.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * 快速排序算法
 */
public class FastSorting {
    private List<Integer> list;
    private List<Integer> newList = new ArrayList<>();

    public FastSorting(List<Integer> list) {
        this.list = list;
        sort();
    }

    public List<Integer> getArray() {
        return newList;
    }

    private void sort() {
        sort(list,true);
    }

    private void sort(List<Integer> list,boolean small) {
        int size = list.size();
        if (size == 0)
            return;
        if (size == 1) {
            if (small)
                newList.add(0,list.get(0));
            else
                newList.add(list.get(0));
            return;
        }
        List<Integer> smaller = new ArrayList<>();
        List<Integer> bigger = new ArrayList<>();
        Integer middle = list.get(0);
        list.remove(0);
        for (int i = 0; i < size - 1; i++) {
            if (list.get(i) < middle)
                smaller.add(list.get(i));
            else
                bigger.add(list.get(i));
        }
        if (small)
            newList.add(0,middle);
        else
            newList.add(middle);
        sort(smaller,true);
        sort(bigger,false);
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
        list.add(6);
        list.add(24);
        list.add(10);
        list.add(8);
        FastSorting sorting = new FastSorting(list);
        System.out.println(sorting.getArray());
    }
}
