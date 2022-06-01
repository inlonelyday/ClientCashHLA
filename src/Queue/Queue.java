package Queue;

/**
 * Created by Stanislaw on 08.05.2018.
 */
public class Queue {
    private int number_of_clients;
    private int max;
    private static Queue instance = null;

    private Queue() {
        number_of_clients =0;
        max=20;

    }

    static public Queue getInstance()
    {
        if(instance==null) instance = new Queue();
        return instance;
    }

    public int getNumber_of_clients() {
        return number_of_clients;
    }

    public void setNumber_of_clients(int number_of_clients) {
        this.number_of_clients = number_of_clients;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public boolean addTo(int count)
    {
        if(this.number_of_clients +count<=this.max) {
            this.number_of_clients += count;
            System.out.println("Queue: I just got for " + count + ". Now I have " + this.number_of_clients + " products");
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
        if(number_of_clients -count>=0) {
            this.number_of_clients -=count;
            System.out.println("Queue: I just given " + count + ". Now I have " + this.number_of_clients + " products");
            return true;
        }
        else
        {
            System.out.println("Queue: I have no left products to give");
            return false;
        }
    }
}
