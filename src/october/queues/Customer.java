package october.queues;

/**
 * 顾客
 */
public class Customer {
    private final int serviceTime;
    public Customer(int tm){
        serviceTime = tm;
    }

    public int getServiceTime() {
        return serviceTime;
    }

    @Override
    public String toString() {
        return "["+serviceTime+"]";
    }
}
