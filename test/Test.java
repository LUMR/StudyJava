import com.lumr.collection.IterableClass;

import java.util.Scanner;

/**
 * Created by lumr on 2017/7/4.
 */
public class Test {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            System.out.println("输入第"+i+"个字符：");
            str[i] = input.next();
        }
        IterableClass strings = new IterableClass(str);
        strings.add("hahaha");
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
