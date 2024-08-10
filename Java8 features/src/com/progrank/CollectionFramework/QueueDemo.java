package src.com.progrank.CollectionFramework;

import java.util.PriorityQueue;

public class QueueDemo {
    public static void main(String[] args) {

        PriorityQueue<String> pq = new PriorityQueue<String>();
        pq.add("ghh");
        pq.add("hjh");
        pq.add("vv");
        pq.add("vv");
        // System.out.println(pq.element());
        // System.out.println(pq.peek());

        // System.out.println(pq.remove());
        // System.out.println(pq.poll());
        pq.poll();
        for (String string : pq) {
            System.out.println(string);
        }
    }
}
