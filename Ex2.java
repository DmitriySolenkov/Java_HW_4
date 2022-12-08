import java.util.LinkedList;
import java.util.Queue;

public class Ex2 {
    public static void main(String[] args) {
        Queue<Integer> list = new LinkedList();
        for (int index = 0; index < 10; index++) {
            list.add((int) (Math.random() * 21 - 10));
        }
        System.out.println(list);
        enqueue(list, 0);
        System.out.println(list);
        dequeue(list);
        System.out.println(list);
        System.out.println(first(list));
    }

    public static Queue enqueue(Queue<Integer> list, int num) {
        list.offer(num);
        return list;
    }

    public static Queue dequeue(Queue<Integer> list) {
        list.remove();
        return list;
    }

    public static int first(Queue<Integer> list) {
        return list.peek();
    }
}
