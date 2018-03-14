package october.queues;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * 顾客队列
 */
public class CustomerLine extends ArrayBlockingQueue<Customer>{
    public CustomerLine(int capacity) {
        super(capacity);
    }

    @Override
    public String toString() {
        if (this.size() == 0)
            return "[Empty]";
        StringBuilder result = new StringBuilder();
        forEach(result::append);
        return result.toString();
    }
}
