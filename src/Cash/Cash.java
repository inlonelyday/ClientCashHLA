package Cash;

import java.util.Random;

/**
 * Created by Stanislaw on 08.05.2018.
 */
public class Cash {
    int timeToNext;
    private Random random;

    public Cash() {
        random = new Random();
        timeToNext = generateTimeToNext();
    }

    public int serve()
    {
        timeToNext=generateTimeToNext();
        int count = random.nextInt(4)+1;
        System.out.println("I want to serve " + count + ". Next I'll be serving in " + timeToNext);
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
