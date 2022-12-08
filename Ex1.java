import java.util.LinkedList;
import java.util.List;

public class Ex1 {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList();
        for (int index = 0; index < 10; index++) {
            list.add((int) (Math.random() * 21 - 10));
        }
        System.out.println(list);
        for (int index = 0; index < list.size() / 2; index++) {
            int buffer = list.get(index);
            list.remove(index);
            list.add(index, list.get(list.size() - index - 1));
            list.remove(list.size() - index - 1);
            list.add(list.size() - index, buffer);
        }
        System.out.println(list);
    }
}