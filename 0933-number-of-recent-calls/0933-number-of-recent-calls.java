import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {

    private Queue<Integer> requests;

    public RecentCounter() {
        requests = new LinkedList<>();
    }
    
    public int ping(int t) {
        requests.offer(t);

        // Remove requests that are older than 3000 ms
        while (requests.peek() < t - 3000) {
            requests.poll();
        }

        return requests.size();
    }
}