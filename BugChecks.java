/**
 * BugChecks - Utility class for validating game state and player interactions
 * 
 * This class provides methods to check for:
 * - Bomb collisions
 * - Win conditions
 * - Valid player movements
 */
public class BugChecks {
    
    /**
     * Checks if the player has collided with a bomb
     * @param playerRow Current row position of player
     * @param playerCol Current column position of player
     * @param map The current game map
     * @return true if player is on a bomb, false otherwise
     */
    public static boolean checkBombCollision(int playerRow, int playerCol, String[][] map) {
        if (isValidPosition(playerRow, playerCol, map)) {
            return map[playerRow][playerCol].equals("B");
        }
        return false;
    }
    
    /**
     * Checks if player has reached the goal/exit
     * @param playerRow Current row position of player
     * @param playerCol Current column position of player
     * @param goalRow Row position of goal
     * @param goalCol Column position of goal
     * @return true if player reached goal, false otherwise
     */
    public static boolean checkWinCondition(int playerRow, int playerCol, int goalRow, int goalCol) {
        return playerRow == goalRow && playerCol == goalCol;
    }
    
    /**
     * Validates if a position is within map bounds
     * @param row Row to validate
     * @param col Column to validate
     * @param map The game map
     * @return true if position is valid, false otherwise
     */
    public static boolean isValidPosition(int row, int col, String[][] map) {
        return row >= 0 && row < map.length && col >= 0 && col < map[0].length;
    }
}
