public class level1 {
    static int[][] map = new int[3][3];

    public static void main(String args[]) {
        int [][] map = {{1, 2, 3, 4}, {6, 7, 8, 9 }};
        for(int i = 0; i < map.length; i++) {
            for(int j = 0; j < map[i].length; j++) {
                System.out.println("| "+ map[i][j] + " |");
            }
        }
    }
}