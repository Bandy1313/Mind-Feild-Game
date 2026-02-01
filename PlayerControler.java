
import java.util.Scanner;

public class PlayerControler {
    private int row;
    private int col;
    private String player;
    public String[][] map;
    private final Scanner scanner;

    public PlayerControler(String[][] map, String player, int startRow, int startCol) {
        this.map = map;
        this.player = player;
        this.row = startRow;
        this.col  = startCol;
        this.scanner = new Scanner(System.in);
        map[row][col] = player;
    }

    public void playerMovement(String input) {
        map[row][col] = " ";
        
        switch (input) {
            case "up":
                col--;
                break;
            case "down":
                col++;
                break;
            case "left":
                row--;
                break;
            case "right":
                row++;
                break;
            default:
                System.err.println("Invalid input. Use: up, down, left, right");
        }
        
        // Update player position on map
        if (isValidPosition()) {
            map[row][col] = player;
        }
    }
    
    public boolean isValidPosition() {
        return row >= 0 && row < map.length && col >= 0 && col < map[0].length;
    }
    
    public int getRow() {
        return row;
    }
    
    public int getCol() {
        return col;
    }


    public String getPlayerLocation(String[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j].equals("x")) {
                    return map[i][j];
                }
            }
            
        }
        return null;
    }
    
}
