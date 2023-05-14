import java.util.Comparator;
import java.util.PriorityQueue;

public class PQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> high =
                new PriorityQueue<>(Integer::compareTo);
        PriorityQueue<Integer> low =
                new PriorityQueue<>(Comparator.<Integer>comparingInt(a -> a).reversed());
        int[] array = {8, 5, 6, 7, 3, 4};

        for (int i : array) {
            System.out.println("i = " + i);
            high.add(i);
            System.out.println("high before = " + high);
            if (high.size() == low.size() + 2)
                low.add(high.poll());

            System.out.println("high = " + high);
            System.out.println("low = " + low);
            System.out.println("==================================");
        }


        System.out.println("high = " + high);
        System.out.println("low = " + low);
        Integer mid1 = high.poll();
        Integer mid2 = low.poll();
        System.out.println("mid1 = " + mid1);
        System.out.println("mid2 = " + mid2);
        System.out.println("==================================");
        double mid;
        if (high.size()==low.size())
            mid=(double) (mid1+mid2)/2;
        else
            mid=mid1;

        System.out.println("mid = " + mid);


    }
}
