package new_;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        formula();
        lambda();
    }

    /**
     * @Author: dingya
     * @Description: lambda 表达式
     * @Date: Created in 14:09 2018/8/20
     */
    public static void lambda() {
        List<String> names = Arrays.asList("peter", "john", "marry", "tomson");
        printStrings(names);
        Collections.sort(names, (a, b) -> b.compareTo(a));
        System.out.println("排序之后：");
        printStrings(names);
    }

    public static void printStrings(List<String> strings) {
        for (int i = 0; i < strings.size(); i++) {
            System.out.print(strings.get(i) + " ");
        }
    }

    /**
     * @Author: dingya
     * @Description: java 8 中接口可以定义非抽象方法，并被子类调用
     * @Date: Created in 14:02 2018/8/20
     */
    public static void formula() {
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return Math.sqrt(100 * a);
            }
        };
        System.out.println(formula.calculate(100));
        System.out.println(formula.sqrt(16));
    }

}
