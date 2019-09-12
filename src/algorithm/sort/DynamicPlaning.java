package algorithm.sort;

import java.util.*;

/**
 * 动态规划
 *
 * @author luwencheng luwc@meicloud.com
 * @since 2019/9/12
 **/
public class DynamicPlaning {

    private Random random = new Random();

    public int[] random() {
        int[] ar = new int[random.nextInt(10)];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = random.nextInt();
        }

        return ar;
    }


    int[] a = {5, 6, 3, 6, 2, 9, 5, 9};

    /**
     * @param ar 输入一个数组
     * @return 返回这数组组合的最大值
     */
    public int cal(int[] ar) {

        Map<Integer, Integer> max = new HashMap<>();
        Map<Integer,Route> routeMap = new HashMap<>();

        for (int i = 0; i < ar.length; i++) {

            if (i - 3 >= 0 && max.containsKey(i - 3)) {
                max.put(i, max.get(i - 3) + ar[i]);
                routeMap.put(i,new Route(routeMap.get(i-3),i,max.get(i)));
            }

            if (i - 2 >= 0 && max.containsKey(i - 2)) {
                if (!max.containsKey(i)) {
                    max.put(i, max.get(i - 2) + ar[i]);
                    routeMap.put(i, new Route(routeMap.get(i - 2), i, max.get(i)));
                }
                else {
                    int other = max.get(i - 2) + ar[i];
                    if (other > max.get(i)) {
                        max.put(i, other);
                        routeMap.put(i,new Route(routeMap.get(i-2),i,max.get(i)));
                    }
                }
            }

            if (i < 2) {
                max.put(i, ar[i]);
                routeMap.put(i,new Route(i,i,ar[i]));
            }

        }

        System.out.println(max);
        System.out.println(routeMap.get(ar.length -1));
        System.out.println(routeMap.get(ar.length -2));
        System.out.println(routeMap.get(ar.length -3));

        return max.values().stream().max(Integer::compareTo).get();
    }

    public static void main(String[] args) {
        DynamicPlaning d = new DynamicPlaning();
        System.out.printf("最大值为%d%n", d.cal(new int[]{5, 9, 5, 2, 4, 6, 8, 12, 4}));
        System.out.printf("最大值为%d%n", d.cal(d.random()));
    }


    private class Route {

        private int from;
        private int to;
        private int maxNum;
        private int[] ar;

        public Route(int from, int to, int maxNum) {
            this.from = from;
            this.to = to;
            this.maxNum = maxNum;
            this.ar = new int[]{to};
        }

        public Route(Route origin, int to, int maxNum) {
            this.from = origin.from;
            this.to = to;
            this.maxNum = maxNum;
            this.ar = new int[origin.ar.length+1];
            System.arraycopy(origin.ar, 0, this.ar, 0, origin.ar.length);
            ar[origin.ar.length] = to;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Route route = (Route) o;
            return from == route.from &&
                    to == route.to;
        }

        @Override
        public int hashCode() {
            return Objects.hash(from, to);
        }

        @Override
        public String toString() {
            return "Route{" +
                    "from=" + from +
                    ", to=" + to +
                    ", maxNum=" + maxNum +
                    ", ar=" + Arrays.toString(ar) +
                    '}';
        }
    }
}
