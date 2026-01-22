
import java.util.Random;


public class Bomb {
    private final String BOMB;

    public Bomb(String BOMB) {
        this.BOMB = BOMB;
    }

    public String getBOMB() {
        return BOMB;
    }

    public static int explode() {
        Random ran = new Random();
        int explosionPower = ran.nextInt(10) + 1;
        return explosionPower;
    }
}
