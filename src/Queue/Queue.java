package Queue;

/**
 * Created by Stanislaw on 08.05.2018.
 */
public class Queue {
    private int available;
    private int max;
    private static Queue instance = null;

    private Queue() {
        available=0;
        max=20;

    }

    static public Queue getInstance()
    {
        if(instance==null) instance = new Queue();
        return instance;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public boolean addTo(int count)
    {
        if(this.available+count<=this.max) {
            this.available += count;
            System.out.println("Queue: I just got for " + count + ". Now I have " + this.available + " products");
            return true;
        }
        else
        {
            System.out.println("Queue: I have no left space for " + count + " products");
            return false;
        }
    }

    public boolean getFrom(int count)
    {
        if(available-count>=0) {
            this.available-=count;
            System.out.println("Queue: I just given " + count + ". Now I have " + this.available + " products");
            return true;
        }
        else
        {
            System.out.println("Queue: I have no left products to give");
            return false;
        }
    }
}
