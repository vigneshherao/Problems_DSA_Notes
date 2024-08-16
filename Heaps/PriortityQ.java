package Heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriortityQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(8);
        pq.add(3);
        pq.add(5);
        pq.add(10);


        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }

    }
}

