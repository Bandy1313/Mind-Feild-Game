

public class Level1 implements levels {
    private String[][] map;
    private Bomb bomb = new Bomb("B");
    private User player = new User("x");
    
    @Override
    public void size(int length, int width) {
        map = new String[length][width];
    }

    @Override
    public void playerSpawn(String[][] location) {
        location[2][1] = player.getPlayer();
    }

    
    public void play() {
    size(3,3);

    for(int i = 0; i < map.length; i++) {
        for(int j = 0; j < map[i].length; j++) {
            map[i][j] = " ";
        }
    }

    playerSpawn(map);

    for(int i = 0; i < map.length; i++) {
        for(int j = 0; j < map[i].length; j++) {
            int result = bomb.explode();
            if(result <= 2) {
                map[i][j] = bomb.getBOMB();
            }
          }
       }

    for(int i = 0; i < map.length; i++) {
        for(int j = 0; j < map[i].length; j++) {
            System.out.print("[" + map[i][j] + "]");
            }
        System.out.println();
        }
    }
}