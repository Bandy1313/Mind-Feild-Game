

public class level1 implements levels {
    private String[][] map;

    @Override
    public void size(int length, int width) {
        map = new String[length][width];
    }
   

public static void main(String args[]) {
    level1 level = new level1();
    level.size(3,3);

    for(int i = 0; i < level.map.length; i++) {
        for(int j = 0; j < level.map[i].length; j++) {
            level.map[i][j] = " ";
        }
    }

    for(int i = 0; i < level.map.length; i++) {
        for(int j = 0; j < level.map[i].length; j++) {
            int result = bomb.explode();
            if(result <= 2) {
                level.map[i][j] = "Bomb";
            }
          }
       }

    for(int i = 0; i < level.map.length; i++) {
        for(int j = 0; j < level.map[i].length; j++) {
            System.out.print("[" + level.map[i][j] + "]");
            }
        System.out.println();
        }
    }
}