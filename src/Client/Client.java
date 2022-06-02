package Client;

import java.util.Random;

/**
 * Created by Stanislaw on 08.05.2018.
 */
public class Client {
    int timeToNext;
    private Random random;

    public Client() {
        random = new Random();
        timeToNext = generateTimeToNext();
    }

    public int create()
    {
        timeToNext=generateTimeToNext();
        int count = random.nextInt(4)+1;
        System.out.println("I created " + count + ". Next I'll create in " + timeToNext);
        return count;
    }

    public int getTimeToNext() {
        return timeToNext;
    }

    private int generateTimeToNext()
    {
        return random.nextInt(10)+1;
    }
}
