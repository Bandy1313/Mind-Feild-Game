public class User {
    private String player;

    public User(String player) {
        this.player = player;
    }

    public String getPlayer() {
        return player;
    }

    public String playerSprite() {
        player = "#";//temp variable for now
        return player;
    }


    public static void main(String[] args) {
        User test = new User("Tyler");
        System.out.println(test.playerSprite());

    }
}
