package collection_;

import java.util.ArrayList;

// ArrayList相当于动态扩容数组,每次扩容1.5倍
public class ArrayList_Test {
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();
        lines.add("1号线");
        lines.add("2号线");
        lines.add("3号线");
        lines.add("4号线");
        for (String line:lines) {
            System.out.println(line);
        }
    }
}
