/**
 * PlayerControler - Manages player movement and position on the game map
 * 
 * Handles:
 * - Player position tracking
 * - Movement validation
 * - Map updates based on player input
 */
import java.util.Scanner;

public class PlayerControler {
    private int row;
    private int col;
    private String player;
    public String[][] map;
    private final Scanner scanner;

    /**
     * Constructor - Initializes player at starting position
     * @param map The game map
     * @param player Player sprite character
     * @param startRow Starting row position
     * @param startCol Starting column position
     */
    public PlayerControler(String[][] map, String player, int startRow, int startCol) {
        this.map = map;
        this.player = player;
        this.row = startRow;
        this.col  = startCol;
        this.scanner = new Scanner(System.in);
        if (isValidPosition()) {
            map[row][col] = player;
        }
    }

    /**
     * Moves player based on input direction
     * @param input Movement direction: "up", "down", "left", "right"
     */
    public void playerMovement(String input) {
        if (!isValidPosition()) {
            return;
        }
        
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
        
        // Update player position on map if valid
        if (isValidPosition()) {
            map[row][col] = player;
        } else {
            // Move back if out of bounds
            map[row][col] = player;
        }
    }
    
    /**
     * Validates if current player position is within map bounds
     * @return true if position is valid, false otherwise
     */
    public boolean isValidPosition() {
        return row >= 0 && row < map.length && col >= 0 && col < map[0].length;
    }
    
    /**
     * Gets player's current row position
     * @return Row index
     */
    public int getRow() {
        return row;
    }
    
    /**
     * Gets player's current column position
     * @return Column index
     */
    public int getCol() {
        return col;
    }

    /**
     * Finds player location on map
     * @param map The game map
     * @return The player sprite if found, null otherwise
     */
    public String getPlayerLocation(String[][] map) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j].equals(player)) {
                    return map[i][j];
                }
            }
        }
        return null;
    }
}
